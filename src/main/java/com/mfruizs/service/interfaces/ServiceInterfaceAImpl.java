package com.mfruizs.service.interfaces;

import com.mfruizs.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceInterfaceAImpl implements ServiceInterface {

	private final Repository repository;

	@Override
	public String getDescriptionFromRepositoryEntity() {

		return repository.getValue().getDescription().concat(" - Service A");
	}
}
