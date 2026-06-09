package com.child.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.child.Dao.ChildEntity;
import com.child.Service.ChildServiceImpl;

@RestController
@RequestMapping("/child")
public class ChildController {

	
	private ChildServiceImpl childServiceImpl;
	
	
	private ChildController(ChildServiceImpl childServiceImpl) {
		super();
		this.childServiceImpl = childServiceImpl;
	}
	@PostMapping
	public ResponseEntity<ChildEntity> createChild(@RequestBody ChildEntity entity){
		ChildEntity childData = childServiceImpl.createChildData(entity);
		return new ResponseEntity<ChildEntity>(childData,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<ChildEntity> getChild(Integer childId){
		ChildEntity childData = childServiceImpl.getChildDataById(childId);
		return new ResponseEntity<ChildEntity>(childData,HttpStatus.OK);	
	}
}
