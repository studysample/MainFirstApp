package in.nit.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IOrderMethodDao;
import in.nit.model.OrderMethod;

@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveOrderMethod(OrderMethod om) {
		
		return (Integer) ht.save(om);
	}

	@Override
	public List<OrderMethod> getAllOrderMethods() {
		
		return ht.loadAll(OrderMethod.class);
	}

	@Override
	public void deleteOrderMethod(Integer id) {
       OrderMethod om=new OrderMethod();
       om.setOmId(id);
       ht.delete(om);

	}

	@Override
	public OrderMethod getOneOrderMethod(Integer id) {
		
		return ht.get(OrderMethod.class,id);
	}

	@Override
	public void updateOrderMethod(OrderMethod om) {
		ht.update(om);

	}

	@Override
	public List<Object[]> getOrderIdAndCode(String mode) {

		String hql="select omId,omCode "
				+ "from in.nit.model.OrderMethod"
				+ " where omMode=?0";
		
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Object[]> list=(List<Object[]>) ht.find(hql,mode);
		return list;
	}

	
}










