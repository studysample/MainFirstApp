package in.nit.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.Part;
import in.nit.service.IOrderMethodService;
import in.nit.service.IPartService;
import in.nit.service.IUomService;
import in.nit.util.CommonUtil;
import in.nit.view.PartExcelView;
import in.nit.view.PartPdfView;

@Controller
@RequestMapping("/part")
public class PartController {
	
	@Autowired
	private IPartService service;
	
	@Autowired
	private IUomService uomservice;
	
	@Autowired
	private IOrderMethodService orderMethodService; 

	//0.     It will show Dropdown at Reg/edit
	
			private void commonUi(Model model) {
				List<Object[]> uomList=uomservice.getUomIdAndUomModel();
				Map<Integer,String> uomMap=CommonUtil.Convert(uomList);
				model.addAttribute("uomMap", uomMap);
				
				List<Object[]> omSaleList=orderMethodService.getOrderIdAndCode("Sale");
				Map<Integer,String> omSaleMap=CommonUtil.Convert(omSaleList);
				model.addAttribute("omSaleMap",omSaleMap);
				
				List<Object[]> omPurchaseList=orderMethodService.getOrderIdAndCode("Purchase");
				Map<Integer,String> omPurchaseMap=CommonUtil.Convert(omPurchaseList);
				model.addAttribute("omPurchaseMap",omPurchaseMap);
			}
			
	
	
	//1.
		@RequestMapping("/register")
		public String showRegisterPage(Model model) {
			model.addAttribute("part", new Part());
			commonUi(model);
			return "PartRegister";
		}	
		
	//2.	
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public String savePart(@ModelAttribute Part part,Model model) {
					
			Integer id=service.savePart(part);
			String message= "Part'" +id+"'saved";
			model.addAttribute("message", message);
			model.addAttribute("part",new Part());
			commonUi(model);
			return "PartRegister";
			
		}
	//3.	
		@RequestMapping("/all")
		public String getallParts(Model model) {
			
			List<Part> list=service.getallParts();
			model.addAttribute("list",list);
			return "PartData";
			
		}
	//4.
		@RequestMapping("/delete")
		public String deletePart(@RequestParam("prid")Integer id,Model model) {
			
			service.deletePart(id);
			String message="Shipment'"+id+"'Deleted";
			model.addAttribute("message", message);
			//fetch  new data
			
			List<Part> list=service.getallParts();
			model.addAttribute("list",list);
			return "PartData";
		}	

	//5.
		@RequestMapping("/edit")
		public String showEditPage(@RequestParam("prid")Integer id, Model model ) {
			
			Part pob=service.getOnePart(id);
			
			model.addAttribute("part", pob);
			
			commonUi(model);
			
			return "PartEdit";
				
		} 

	//6.	
		@RequestMapping(value="update", method=RequestMethod.POST)
		public String updatePart(@ModelAttribute Part part, Model model) {
			
			service.updatePart(part);
			String message="Part'"+part+"'Updated";
			
			model.addAttribute("message",message);
			List<Part> list=service.getallParts();
			model.addAttribute("list",list);
			
			return "PartData";
			
		}
		
	//7.	
		@RequestMapping("/view")
		public String showVeiwPage(@RequestParam("prid")Integer id, Model model) {
			
			Part st=service.getOnePart(id);
			model.addAttribute("ob",st);
			return "PartView";
			
		}
    //8.
		@RequestMapping("/excel")
		public ModelAndView showExcel(@RequestParam (value="prid",required=false) Integer id) {
			
			ModelAndView m=new ModelAndView();
			m.setView(new PartExcelView());
			
			//fetching data from DB
	       if(id==null) {
			List<Part> list=service.getallParts();
			m.addObject("list", list);
	       }else{
	        //export one row by id
	    	   Part st=service.getOnePart(id);
	    	   m.addObject("list", Arrays.asList(st));   
	       }
			return m;
			
		}
		
 //9.
		@RequestMapping("/pdf")
		public ModelAndView showPdfView(@RequestParam(value="prid",required=false) Integer id) {
			
			ModelAndView m=new ModelAndView();
			m.setView(new PartPdfView());
			if (id==null) {
			   List<Part> list=service.getallParts();
			   m.addObject("list",list);
	           }
			else {
				Part pob=service.getOnePart(id);
				m.addObject("list",Arrays.asList(pob));
			}
			return m;
		}
		
}
