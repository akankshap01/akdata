package com.training.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="projectTab")
public class Project {
	@Id
	private int pid;
	private String name;
	private int duration;
	@ManyToMany(mappedBy="sproj",fetch=FetchType.LAZY)
	Set<Employee> eset=new HashSet<Employee>();
	
	public Project() {
		super();
	}

	public Project(int pid, String name, int duration, Set<Employee> eset) {
		super();
		this.pid = pid;
		this.name = name;
		this.duration = duration;
		this.eset = eset;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Set<Employee> getEset() {
		return eset;
	}

	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + ", duration=" + duration + ", eset=" + eset + "]";
	}
	
	

}
