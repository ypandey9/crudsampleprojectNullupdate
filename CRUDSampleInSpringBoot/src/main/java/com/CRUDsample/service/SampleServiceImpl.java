package com.CRUDsample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUDsample.model.EntitySample;
import com.CRUDsample.repository.SampleRepository;

@Service
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	private SampleRepository sampleRepository; 

	@Override
	public List<EntitySample> getAllName() {
		return sampleRepository.findAll();
	}

	@Override
	public EntitySample getById(int id) {
		return sampleRepository.findById(id).get();
	}

	@Override
	public EntitySample saveEntity(EntitySample entitySample) {
		return sampleRepository.save(entitySample);
	}

	@Override
	public void deleteRecordById(int id) {
		sampleRepository.deleteById(id);
		
	}

	@Override
	public EntitySample updateEntity(int id,EntitySample entitySample) {
		
		EntitySample existingEntity=getById(id);
		existingEntity.setId(id);
		existingEntity.setName(existingEntity.getName());
		return saveEntity(existingEntity);
		
	}

	

}
