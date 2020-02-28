package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;
@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {

	@Autowired
	private HibernateTemplate ht;
	
	public Integer saveShipmentType(ShipmentType ob) {
		return (Integer)ht.save(ob);
		
	}

	@Override
	public List<ShipmentType> getallShipmentTypes() {
		
		return ht.loadAll(ShipmentType.class);
	}

	@Override
	public void deleteShipmentType(Integer id) {
		ShipmentType  ob= new ShipmentType();
		ob.setShipId(id);
		ht.delete(ob);
	}
	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		return ht.get(ShipmentType.class, id);
	}

	@Override
	public void updateShipmentType(ShipmentType ob) {
		ht.update(ob);
		
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Object[]> getShipmentModeCount() {
		
        String hql="select shipMode,count(shipMode) "
        		+ "from in.nit.model.ShipmentType "
        		+ "group by shipMode";        
		
		
		return (List<Object[]>) ht.find(hql);
	}
}




















