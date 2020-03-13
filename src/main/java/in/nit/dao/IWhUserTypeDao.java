package in.nit.dao;

import java.util.List;

import in.nit.model.WhUserType;

public interface IWhUserTypeDao {
	
public Integer saveWhUserType(WhUserType whu);
	
	public List<WhUserType> getAllWhUserTypes();
	
	public void deleteWhUserType(Integer id);
	
	public WhUserType getOneWhUserType(Integer id);
	
	public void updateWhUserType(WhUserType whu);
	
	public List<Object[]>getWhUserTypeIdAndCode(String userType);

}
