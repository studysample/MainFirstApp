package in.nit.dao;

import java.util.List;

import in.nit.model.Part;

public interface IPartDao {
	
    Integer savePart(Part pob);
	
	List<Part> getallParts();
		
	void deletePart(Integer id);
	
	Part getOnePart(Integer id);
	
    void updatePart(Part pob);
    
    
}
