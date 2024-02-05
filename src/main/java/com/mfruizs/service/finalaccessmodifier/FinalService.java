package com.mfruizs.service.finalaccessmodifier;

import com.mfruizs.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FinalService {

	private final Repository repository;

	public String getDescriptionFromEntity() {

		return repository.getValue().getDescription();
	}

}
