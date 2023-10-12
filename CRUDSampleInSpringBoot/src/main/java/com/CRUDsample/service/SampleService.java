package com.CRUDsample.service;

import java.util.List;

import com.CRUDsample.model.EntitySample;

public interface SampleService {
public List<EntitySample> getAllName();
public EntitySample getById(int id);
public EntitySample saveEntity(EntitySample entitySample);
public void deleteRecordById(int id);
public EntitySample updateEntity(int id,EntitySample entitySample);

}
