package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IPurchaseOrderDao;
import in.nit.model.PurchaseOrder;

@Repository
public class PurchaseOrderDaoImpl implements IPurchaseOrderDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer savePurchaseOrder(PurchaseOrder pcob) {
		 
		return (Integer)ht.save(pcob);
	}

	@Override
	public List<PurchaseOrder> getallPurchaseOrders() {
		 
		return ht.loadAll(PurchaseOrder.class);
	}

	@Override
	public void deletePurchaseOrder(Integer id) {
		PurchaseOrder pcob=new PurchaseOrder();
		pcob.setPcordId(id);
		ht.delete(pcob);
		
	}

	@Override
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		 
		return ht.get(PurchaseOrder.class, id);
	}

	@Override
	public void updatePurchaseOrder(PurchaseOrder pcob) {
		 ht.update(pcob);
		
	}

}
