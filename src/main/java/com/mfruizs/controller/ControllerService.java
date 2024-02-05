package com.mfruizs.controller;

import com.mfruizs.model.InterfaceSelector;
import com.mfruizs.service.autowired.AutowiredService;
import com.mfruizs.service.createinstance.CreateInstanceService;
import com.mfruizs.service.finalaccessmodifier.FinalService;
import com.mfruizs.service.interfaces.MainInterfaceService;
import com.mfruizs.service.optional.MainOptionalService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Endpoint Controller")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ControllerService {

	private final AutowiredService autowiredService;
	private final CreateInstanceService createInstanceService;
	private final FinalService finalService;
	private final MainInterfaceService mainInterfaceService;
	private final MainOptionalService mainOptionalService;


	@GetMapping("/autowired")
	public ResponseEntity<String> recoverResponseFromAutoWiredService() {

		String response = autowiredService.getDescriptionFromEntity();
		return new ResponseEntity<>("autowired: " + response, HttpStatus.OK);
	}

	@GetMapping("/created")
	public ResponseEntity<String> recoverResponseFromCreatedService() {

		String response = createInstanceService.getDescriptionFromRepositoryEntity();
		return new ResponseEntity<>("created: " + response, HttpStatus.OK);
	}

	@GetMapping("/final")
	public ResponseEntity<String> recoverResponseFromFinalService() {

		String response = finalService.getDescriptionFromEntity();
		return new ResponseEntity<>("final: " + response, HttpStatus.OK);
	}


	@GetMapping("/interfaces/{selector}")
	public ResponseEntity<String> recoverResponseFromInterfaceService(@Parameter(description = "Interface", example = "A")
																	  @PathVariable  final InterfaceSelector selector) {

		String response = mainInterfaceService.getDescriptionFromSelectedService(selector);
		return new ResponseEntity<>("interfaces: " + response, HttpStatus.OK);
	}

	@GetMapping("/optional")
	public ResponseEntity<String> recoverResponseFromOptionalService() throws Exception {

		String response = mainOptionalService.getDescriptionFromEntity();
		return new ResponseEntity<>("optional: " + response, HttpStatus.OK);
	}

}
