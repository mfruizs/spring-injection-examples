package com.mfruizs.service.optional;

import com.mfruizs.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@ConditionalOnProperty(name = "service.optional.enabled", havingValue = "true")
public class OptionalService {

	private final Repository repository;

	public String getDescriptionFromEntity() {

		return repository.getValue().getDescription();
	}

}
