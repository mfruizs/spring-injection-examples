package com.mfruizs.service.autowired;

import com.mfruizs.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutowiredService {

	@Autowired
	@SuppressWarnings("java:S6813")
	public Repository repository;

	public String getDescriptionFromEntity() {

		return repository.getValue().getDescription();
	}

}
