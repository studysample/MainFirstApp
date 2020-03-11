package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Controller
@RequestMapping("/whuser")
public class WhUserTypeController {

	@Autowired
	private IWhUserTypeService service;
	
	//1.
		@RequestMapping("/register")
		public String showRegisterPage(Model model) {
			model.addAttribute("whUserType", new WhUserType());
			return "WhUserTypeRegister";
		}	
		
	//2.	
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public String saveWhUserType(@ModelAttribute WhUserType whUserType, Model model) {
					
			Integer id=service.saveWhUserType(whUserType);
			String message= "WhUserType'" +id+"'saved";
			model.addAttribute("message", message);
			model.addAttribute("whUserType",new WhUserType());
			return "WhUserTypeRegister";
			
		}
	//3.	
		@RequestMapping("/all")
		public String getallWhUserTypes(Model model) {
			
			List<WhUserType> list=service.getAllWhUserTypes();
			model.addAttribute("list",list);
			return "WhUserTypeData";
			
		}
	//4.
		@RequestMapping("/delete")
		public String deleteWhUser(@RequestParam("usid")Integer id,Model model) {
			
			service.deleteWhUserType(id);
			String message="WhUser'"+id+"'Deleted";
			model.addAttribute("message", message);
			//fetch  new data
			
			List<WhUserType> list=service.getAllWhUserTypes();
			model.addAttribute("list",list);
			return "WhUserTypeData";
		}	

	//5.
		@RequestMapping("/edit")
		public String showEditPage(@RequestParam("usid")Integer id, Model model ) {
			
			WhUserType whu=service.getOneWhUserType(id);
			
			model.addAttribute("whUserType", whu);
			
			return "WhUserTypeEdit";
				
		}

	//6.	
		@RequestMapping(value="update", method=RequestMethod.POST)
		public String updateWhUserType(@ModelAttribute WhUserType whUserType, Model model) {
			
			service.updateWhUserType(whUserType);
			String message="WhUserType'"+whUserType+"'Updated";
			
			model.addAttribute("message",message);
			List<WhUserType> list=service.getAllWhUserTypes();
			model.addAttribute("list",list);
			
			return "WhUserTypeData";
			
		}
		
	//7.	
		@RequestMapping("/view")
		public String showVeiwPage(@RequestParam("usid")Integer id, Model model) {
			
			WhUserType whu=service.getOneWhUserType(id);
			model.addAttribute("ob",whu);
			return "WhUserTypeView";
			
		}
}
