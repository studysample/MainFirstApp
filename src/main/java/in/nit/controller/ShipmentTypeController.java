package in.nit.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;
import in.nit.util.ShipmentTypeUtil;
import in.nit.view.ShipmentTypeExcelView;
import in.nit.view.ShipmentTypePdfView;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	
	@Autowired
	private IShipmentTypeService service;
	
	@Autowired
	private ServletContext context;
	
	private ShipmentTypeUtil util;
//1.
	@RequestMapping("/register")
	public String showRegisterPage(Model model) {
		model.addAttribute("shipmentType", new ShipmentType());
		return "ShipmentTypeRegister";
	}	
	
//2.	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveShipmentType(@ModelAttribute ShipmentType shipmentType,Model model) {
				
		Integer id=service.saveShipmentType(shipmentType);
		String message= "shipmentType'" +id+"'saved";
		model.addAttribute("message", message);
		model.addAttribute("shipmentType",new ShipmentType());
		return "ShipmentTypeRegister";
		
	}
//3.	
	@RequestMapping("/all")
	public String getallShipmentTypes(Model model) {
		
		List<ShipmentType> list=service.getallShipmentTypes();
		model.addAttribute("list",list);
		return "ShipmentTypeData";
		
	}
//4.
	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam("sid")Integer id,Model model) {
		
		service.deleteShipmentType(id);
		String message="Shipment'"+id+"'Deleted";
		model.addAttribute("message", message);
		//fetch  new data
		
		List<ShipmentType> list=service.getallShipmentTypes();
		model.addAttribute("list",list);
		return "ShipmentTypeData";
	}	

//5.
	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("sid")Integer id, Model model ) {
		
		ShipmentType st=service.getOneShipmentType(id);
		
		model.addAttribute("shipmentType", st);
		
		return "ShipmentTypeEdit";
			
	}

//6.	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public String updateShipmentType(@ModelAttribute ShipmentType shipmentType, Model model) {
		
		service.updateShipmentType(shipmentType);
		String message="ShipmentType'"+shipmentType+"'Updated";
		
		model.addAttribute("message",message);
		List<ShipmentType> list=service.getallShipmentTypes();
		model.addAttribute("list",list);
		
		return "ShipmentTypeData";
		
	}
	
//7.	
	@RequestMapping("/view")
	public String showVeiwPage(@RequestParam("sid")Integer id, Model model) {
		
		ShipmentType st=service.getOneShipmentType(id);
		model.addAttribute("ob",st);
		return "ShipmentTypeView";
		
	}
	
//8.
	@RequestMapping("excel")
	public ModelAndView showExcel(@RequestParam (value="id",required=false) Integer id) {
		
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		
		//fetching data from DB
       if(id==null) {
		List<ShipmentType> list=service.getallShipmentTypes();
		m.addObject("list", list);
       }else{
        //export one row by id
    	   ShipmentType st=service.getOneShipmentType(id);
    	   m.addObject("list", Arrays.asList(st));   
       }
		return m;
		
	}

//9.
    @RequestMapping("/pdf")
	public ModelAndView showPdfView(@RequestParam(value="id",required=false) Integer id) {
    	
    	ModelAndView m=new ModelAndView();
    	m.setView(new ShipmentTypePdfView());
    	if(id==null) {
    	List<ShipmentType> list= service.getallShipmentTypes();
    	
    	//send data to pdf
    	m.addObject("list", list);
    	}else {
    		ShipmentType st=service.getOneShipmentType(id);
    		m.addObject("list", Arrays.asList(st));
    	}
		return m;
		
	}
 //10.
    
    @RequestMapping("/charts")
    public String showCharts() {
    	List<Object[]> list=service.getShipmentModeCount();
    	String path=context.getRealPath("/");
    	util.generatePie(path, list);
    	util.generateBar(path, list);
		return "ShipmentTypeCharts";
    }
}


































