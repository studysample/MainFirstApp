package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IPurchaseOrderDao;
import in.nit.model.PurchaseOrder;
import in.nit.service.IPurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements IPurchaseOrderService {
	
	@Autowired
	private IPurchaseOrderDao dao;

	@Transactional
	public Integer savePurchaseOrder(PurchaseOrder pcob) {
		 
		return dao.savePurchaseOrder(pcob);
	}

	@Transactional(readOnly=true)
	public List<PurchaseOrder> getallPurchaseOrders() {
		 
		return dao.getallPurchaseOrders();
	}

	@Transactional
	public void deletePurchaseOrder(Integer id) {
		 dao.deletePurchaseOrder(id);

	}

	@Transactional(readOnly=true)
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		 
		return dao.getOnePurchaseOrder(id);
	}

	@Transactional
	public void updatePurchaseOrder(PurchaseOrder pcob) {
		  dao.updatePurchaseOrder(pcob);

	}

}
