package in.nit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.OrderMethod;
import in.nit.service.IOrderMethodService;
import in.nit.view.OrderMethodExcelView;
import in.nit.view.OrderMethodPdfView;

@Controller
@RequestMapping("/order")
public class OrderMethodController {

	@Autowired
	private IOrderMethodService service;
	
	@RequestMapping("/register")
	public String showRegisterPage(Model model) {
		model.addAttribute("orderMethod", new OrderMethod());
		return "OrderMethodRegister";
	}	
	
//2.	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveOrderMethod(@ModelAttribute OrderMethod orderMethod,Model model) {
				
		Integer id=service.saveOrderMethod(orderMethod);
		String message= "OrderMethod'" +id+"'saved";
		model.addAttribute("message", message);
		model.addAttribute("orderMethod",new OrderMethod());
		return "OrderMethodRegister";
		
	}
//3.	
	@RequestMapping("/all")
	public String getallOrderMethods(Model model) {
		
		List<OrderMethod> list=service.getAllOrderMethods();
		model.addAttribute("list",list);
		return "OrderMethodData";
		
	}
//4.
	@RequestMapping("/delete")
	public String deleteOrder(@RequestParam("oid")Integer id,Model model) {
		
		service.deleteOrderMethod(id);
		String message="Oreder'"+id+"'Deleted";
		model.addAttribute("message", message);
		//fetch  new data
		
		List<OrderMethod> list=service.getAllOrderMethods();
		model.addAttribute("list",list);
		return "OrderMethodData";
	}	

//5.
	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("oid")Integer id, Model model ) {
		
		OrderMethod om=service.getOneOrderMethod(id);
		
		model.addAttribute("orderMethod", om);
		
		return "OrderMethodEdit";
			
	}

//6.	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public String updateOrderMethod(@ModelAttribute OrderMethod orderMethod, Model model) {
		
		service.updateOrderMethod(orderMethod);
		String message="OrderMethod'"+orderMethod+"'Updated";
		
		model.addAttribute("message",message);
		List<OrderMethod> list=service.getAllOrderMethods();
		model.addAttribute("list",list);
		
		return "OrderMethodData";
		
	}
	
//7.	
	@RequestMapping("/view")
	public String showVeiwPage(@RequestParam("oid")Integer id, Model model) {
		
		OrderMethod om=service.getOneOrderMethod(id);
		model.addAttribute("ob",om);
		return "OrderMethodView";
		
	}
//8.
	@RequestMapping("/excel")
	public ModelAndView showExcelView(@RequestParam (value="id", required=false) Integer id ) {
		
		ModelAndView m=new ModelAndView();
		m.setView(new OrderMethodExcelView());
		
        //ferching data from db
		if(id==null) {
			List<OrderMethod> list=service.getAllOrderMethods();
			m.addObject("list", list);
		}else {
			//export one row by id
			OrderMethod om=service.getOneOrderMethod(id);
			m.addObject("list", Arrays.asList(om));
		}
		
		return m;
		
	}
	
//9.
    @RequestMapping("/pdf")
	public ModelAndView showPdfView(@RequestParam(value="id",required=false) Integer id) {
    	
    	ModelAndView m=new ModelAndView();
    	m.setView(new OrderMethodPdfView());
    	if(id==null) {
    	List<OrderMethod> list= service.getAllOrderMethods();
    	
    	//send data to pdf
    	m.addObject("list", list);
    	}else {
    		OrderMethod om=service.getOneOrderMethod(id);
    		m.addObject("list", Arrays.asList(om));
    	}
		return m;
		
	}
}
























