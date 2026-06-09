package com.child.Service;

import java.sql.Savepoint;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.child.Dao.ChildEntity;
import com.child.Dao.ChildRepo;

@Service
public  class ChildServiceImpl implements ChildService {

	
	private ChildRepo childrepo;

	
	public ChildServiceImpl(ChildRepo childrepo) {
		super();
		this.childrepo = childrepo;
	}

	@Override
	public ChildEntity createChildData(ChildEntity child) {
		return childrepo.save(child);
	}

	@Override
	public ChildEntity getChildDataById(Integer ChildId) {
		Optional<ChildEntity> byId = childrepo.findById(ChildId);
		
		return byId.get();
	}


	@Override
	public ChildEntity updateChildData(ChildEntity child, Integer childId) {
		Optional<ChildEntity> byId = childrepo.findById(childId);
		if(byId.isPresent()) {
			ChildEntity childEntity = byId.get();
			if(childEntity.getChildName()!=null && !(childEntity.getChildName().isEmpty())) {
				childEntity.setChildName(childEntity.getChildName());
			}
			if(childEntity.getChildEmail()!=null && !(childEntity.getChildAddress().isEmpty())) {
				childEntity.setChildAddress(childEntity.getChildAddress());
			}
			if(childEntity.getChildEmail()!=null && !(childEntity.getChildEmail().isEmpty())) {
				childEntity.setChildEmail(childEntity.getChildEmail());
			}
			return childrepo.save(childEntity);
		}else {
				return childrepo.save(null);
			}
	}

	@Override
	public void deleteChildData(Integer ChildId) {
		childrepo.deleteById(ChildId);

	}
}
