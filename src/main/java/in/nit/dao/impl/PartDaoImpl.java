package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IPartDao;
import in.nit.model.Part;

@Repository
public class PartDaoImpl implements IPartDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer savePart(Part pob) {
		 
		return (Integer)ht.save(pob);
	}

	@Override
	public List<Part> getallParts() {
		 
		return ht.loadAll(Part.class);
	}

	@Override
	public void deletePart(Integer id) {
		 Part pob=new Part();
		 pob.setId(id);
		 ht.delete(pob);

	}

	@Override
	public Part getOnePart(Integer id) {
		 
		return ht.get(Part.class,id);
	}

	@Override
	public void updatePart(Part pob) {
	    
		ht.update(pob);

	}

}
