package com.ittx.hibate.model;
/*
 * 部门
 */
public class Department {
      private int d_id;
      private String name;
      private String introduce;//部门介绍
      
	public Department() {
		
	}
	public Department(int d_id, String name, String introduce) {
		this.d_id = d_id;
		this.name = name;
		this.introduce = introduce;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", name=" + name + ", introduce=" + introduce + "]";
	}
	
	
}
