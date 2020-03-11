package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements IWhUserTypeDao {
	
	@Autowired
	private HibernateTemplate ht;

	 
	public Integer saveWhUserType(WhUserType whu) {
		
		return (Integer)ht.save(whu);
	}

	 
	public List<WhUserType> getAllWhUserTypes() {
		
		return ht.loadAll(WhUserType.class) ;
	}

	 
	public void deleteWhUserType(Integer id) {
		WhUserType whu=new WhUserType();
		whu.setUserId(id);
		ht.delete(whu);
		
	}

	 
	public WhUserType getOneWhUserType(Integer id) {
		
		return ht.get(WhUserType.class,id);
	}

	 
	public void updateWhUserType(WhUserType whu) {
		ht.update(whu);
		
	}

}
