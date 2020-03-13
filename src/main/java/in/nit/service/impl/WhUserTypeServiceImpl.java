package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {

	@Autowired
	private IWhUserTypeDao dao;

	@Transactional
	public Integer saveWhUserType(WhUserType whu) {
		  
		return dao.saveWhUserType(whu);
	}

	@Transactional(readOnly=true)
	public List<WhUserType> getAllWhUserTypes() {
		  
		return dao.getAllWhUserTypes();
	}

	@Transactional
	public void deleteWhUserType(Integer id) {
		 
		dao.deleteWhUserType(id);
	}

	@Transactional(readOnly=true)
	public WhUserType getOneWhUserType(Integer id) {
		  
		return dao.getOneWhUserType(id);
	}

	@Transactional
	public void updateWhUserType(WhUserType whu) {
		  dao.updateWhUserType(whu);

	}

	@Transactional(readOnly=true)
	public List<Object[]> getWhUserTypeIdAndCode(String userType) {

		
		return dao.getWhUserTypeIdAndCode(userType);
	}

}
