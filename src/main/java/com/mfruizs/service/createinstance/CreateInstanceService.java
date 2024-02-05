package com.mfruizs.service.createinstance;

import com.mfruizs.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public class CreateInstanceService {

	private final Repository repository;

	public CreateInstanceService() {

		this.repository = new Repository();
	}

	public String getDescriptionFromRepositoryEntity() {

		return repository.getValue().getDescription();
	}
}
