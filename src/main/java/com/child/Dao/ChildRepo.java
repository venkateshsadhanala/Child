package com.child.Dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepo extends CrudRepository<ChildEntity, Integer>{

	

}
