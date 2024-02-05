package com.mfruizs.service.optional;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainOptionalService {

	@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
	private Optional<OptionalService> optionalService;

	@Autowired
	@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
	public MainOptionalService(final Optional<OptionalService> optionalService) {

		this.optionalService = optionalService;
	}

	public String getDescriptionFromEntity() throws Exception {

		return this.optionalService
			.orElseThrow(this::throwException)
			.getDescriptionFromEntity();

	}

	private Exception throwException() {

		return new Exception("Optional service is Disabled");
	}

}
