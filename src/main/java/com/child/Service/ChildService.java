package com.child.Service;

import org.springframework.stereotype.Service;

import com.child.Dao.ChildEntity;

public interface ChildService {
	
	public ChildEntity createChildData(ChildEntity child);
	
	public ChildEntity getChildDataById(Integer ChildId);
	
	public ChildEntity updateChildData(ChildEntity child, Integer childId);
	
	public void deleteChildData(Integer ChildId);

	


}
