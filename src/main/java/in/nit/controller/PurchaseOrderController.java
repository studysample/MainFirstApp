package in.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.PurchaseOrder;
import in.nit.service.IPurchaseOrderService;
import in.nit.service.IShipmentTypeService;
import in.nit.service.IWhUserTypeService;
import in.nit.util.CommonUtil;

@Controller
@RequestMapping("/purchase")
public class PurchaseOrderController {

	@Autowired
	private IPurchaseOrderService service;
	
	@Autowired
	private IShipmentTypeService shipmentTypeService;
	
	@Autowired
	private IWhUserTypeService whUserTypeService;
	
	//0.
	
	private void commonUi(Model model) {
		
		List<Object[]> shipList=shipmentTypeService.getShipmetIdAndCode();
		Map<Integer,String> shipMap=CommonUtil.Convert(shipList);
		model.addAttribute("shipMap", shipMap);
		
		List<Object[]> whList=whUserTypeService.getWhUserTypeIdAndCode("Vendor");
		Map<Integer,String> whMap=CommonUtil.Convert(whList);
		model.addAttribute("whMap", whMap);
	}
	
	//1.
			@RequestMapping("/register")
			public String showRegisterPage(Model model) {
				model.addAttribute("purchaseOrder", new PurchaseOrder());
				commonUi(model);
				return "PurchaseOrderRegister";
			}	
			
		//2.	
			@RequestMapping(value="/save",method=RequestMethod.POST)
			public String savePurchaseOrder(@ModelAttribute PurchaseOrder purchaseOrder,Model model) {
						
				Integer id=service.savePurchaseOrder(purchaseOrder);
				String message= "PurchaseOrder'" +id+"'saved";
				model.addAttribute("message", message);
				model.addAttribute("purchaseOrder",new PurchaseOrder());
				commonUi(model);
				return "PurchaseOrderRegister";
				
			}
		//3.	
			@RequestMapping("/all")
			public String getallPurchaseOrders(Model model) {
				
				List<PurchaseOrder> list=service.getallPurchaseOrders();
				model.addAttribute("list",list);
				return "PurchaseOrderData";
				
			}
		//4.
			@RequestMapping("/delete")
			public String deletePurchaseOrder(@RequestParam("purchaseid")Integer id,Model model) {
				
				service.deletePurchaseOrder(id);
				String message="Shipment'"+id+"'Deleted";
				model.addAttribute("message", message);
				//fetch  new data
				
				List<PurchaseOrder> list=service.getallPurchaseOrders();
				model.addAttribute("list",list);
				return "PurchaseOrderData";
			}	

		//5.
			@RequestMapping("/edit")
			public String showEditPage(@RequestParam("purchaseid")Integer id, Model model ) {
				
				PurchaseOrder pcob=service.getOnePurchaseOrder(id);
				
				model.addAttribute("purchaseOrder", pcob);
				
				commonUi(model);
				
				return "PurchaseOrderEdit";
					
			}

		//6.	
			@RequestMapping(value="update", method=RequestMethod.POST)
			public String updatePurchaseOrder(@ModelAttribute PurchaseOrder purchaseOrder, Model model) {
				
				service.updatePurchaseOrder(purchaseOrder);
				String message="PurchaseOrder'"+purchaseOrder+"'Updated";
				
				model.addAttribute("message",message);
				List<PurchaseOrder> list=service.getallPurchaseOrders();
				model.addAttribute("list",list);
				
				return "PurchaseOrderData";
				
			}
			
		//7.	
			@RequestMapping("/view")
			public String showVeiwPage(@RequestParam("purchaseid")Integer id, Model model) {
				
				PurchaseOrder pcob=service.getOnePurchaseOrder(id);
				model.addAttribute("ob",pcob);
				return "PurchaseOrderView";
				
			}
		
}
