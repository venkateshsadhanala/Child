package com.child.Dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ChildEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int ChildId;
	@Column(name="Name")
	private String ChildName;
	@Column(name="Address")
	private String ChildAddress;
	@Column(name="Email")
	private String ChildEmail;
	@Column(name="salary")
	private double ChildSalary;
	
	
	public int getChildId() {
		return ChildId;
	}
	public void setChildId(int childId) {
		ChildId = childId;
	}
	public String getChildName() {
		return ChildName;
	}
	public void setChildName(String childName) {
		ChildName = childName;
	}
	public String getChildAddress() {
		return ChildAddress;
	}
	public void setChildAddress(String childAddress) {
		ChildAddress = childAddress;
	}
	public String getChildEmail() {
		return ChildEmail;
	}
	public void setChildEmail(String childEmail) {
		ChildEmail = childEmail;
	}
	public double getChildSalary() {
		return ChildSalary;
	}
	public void setChildSalary(double childSalary) {
		ChildSalary = childSalary;
	}
//added comments
	
}
