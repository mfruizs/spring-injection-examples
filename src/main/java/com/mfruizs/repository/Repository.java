package com.mfruizs.repository;

import com.mfruizs.model.Entity;

@org.springframework.stereotype.Repository
public class Repository {

	public Entity getValue() {
		return Entity.builder()
			.id(1)
			.description("mocked item from Repository")
			.build();
	}

}
