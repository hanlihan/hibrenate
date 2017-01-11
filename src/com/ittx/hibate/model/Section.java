package com.ittx.hibate.model;

import java.util.Set;

public class Section {
    private int id;
    private String name;
    private String explanation;
    private Set<People> peoples;
	public Section() {
	}
	public Section(int id, String name, String explanation) {
		this.id = id;
		this.name = name;
		this.explanation = explanation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public Set<People> getPeoples() {
		return peoples;
	}
	public void setPeoples(Set<People> peoples) {
		this.peoples = peoples;
	}
	
}
