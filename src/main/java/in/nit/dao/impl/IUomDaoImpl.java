package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomDao;
import in.nit.model.Uom;

@Repository
public class IUomDaoImpl implements IUomDao {
	
	@Autowired
	private HibernateTemplate ht;
	
      public Integer saveUom(Uom u) {
	
	         return (Integer) ht.save(u);
  }


       public List<Uom> getAllUoms() {
	
    	   	 return ht.loadAll(Uom.class);
  }
       
     
    public void deleteUom(Integer id) {
        Uom u=new Uom();
        u.setUomId(id);
    	ht.delete(u);
    }
    
    
    public Uom getOneUom(Integer id) {
    
    	return ht.get(Uom.class,id);
    }
    
    public void updateUom(Uom u) {
            ht.update(u);
    }
    
   @Override
public List<Object[]> getUomIdAndUomModel() {

	String hql="select uomId,uomModel from in.nit.model.Uom";
	@SuppressWarnings({ "unchecked", "deprecation" })
	List<Object[]> list=(List<Object[]>)ht.find(hql);
		return list;
	
	
}
}

