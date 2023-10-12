package com.CRUDsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_sample")
public class EntitySample {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name="name")
private String name;

public EntitySample() {}

public EntitySample(String name) {
	super();
	this.name = name;
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

@Override
public String toString() {
	return "EntitySample [id=" + id + ", name=" + name + "]";
}



}
