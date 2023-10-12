package com.CRUDsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUDsample.model.EntitySample;
@Repository
public interface SampleRepository extends JpaRepository<EntitySample,Integer>{

}
