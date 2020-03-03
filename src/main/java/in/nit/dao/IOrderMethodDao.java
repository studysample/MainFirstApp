package in.nit.dao;

import java.util.List;

import in.nit.model.OrderMethod;

public interface IOrderMethodDao {
	
    public Integer saveOrderMethod(OrderMethod om);
	
	public List<OrderMethod> getAllOrderMethods();
	
	public void deleteOrderMethod(Integer id);
	
	public OrderMethod getOneOrderMethod(Integer id);
	
	public void updateOrderMethod(OrderMethod om);

}
