package in.nit.dao;

import java.util.List;

import in.nit.model.PurchaseOrder;

public interface IPurchaseOrderDao {
	

    Integer savePurchaseOrder(PurchaseOrder pcob);
	
	List<PurchaseOrder> getallPurchaseOrders();
		
	void deletePurchaseOrder(Integer id);
	
	PurchaseOrder getOnePurchaseOrder(Integer id);
	
    void updatePurchaseOrder(PurchaseOrder pcob);

}
