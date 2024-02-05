package com.mfruizs.service.interfaces;

import com.mfruizs.model.InterfaceSelector;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainInterfaceService {

	private final List<ServiceInterface> services;

	public String getDescriptionFromSelectedService(final InterfaceSelector selector) {

		if (InterfaceSelector.A.getSelector().equals(selector.getSelector())) {
			return services.get(0).getDescriptionFromRepositoryEntity();
		}

		if (InterfaceSelector.B.getSelector().equals(selector.getSelector())) {
			return services.get(1).getDescriptionFromRepositoryEntity();
		}

		return "Not found";
	}

}
