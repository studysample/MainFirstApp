package in.nit.service;

import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentTypeService {
	
	Integer saveShipmentType(ShipmentType ob);
	
	List<ShipmentType> getallShipmentTypes();
	
	void deleteShipmentType(Integer id);
	
	ShipmentType getOneShipmentType(Integer id);
	
	void updateShipmentType(ShipmentType ob);
	
	public List<Object[]>getShipmentModeCount();
	
	 public List<Object[]>getShipmetIdAndCode();

}
