package br.com.georges.meetupmanager.controller.web;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.georges.meetupmanager.controller.dto.RegistrationDTO;
import br.com.georges.meetupmanager.model.Registration;
import br.com.georges.meetupmanager.service.RegistrationService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {
	
	private RegistrationService registrationService;

    private ModelMapper modelMapper;

    public RegistrationController(RegistrationService registrationService, ModelMapper modelMapper) {
        this.registrationService = registrationService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RegistrationDTO create(@RequestBody @Valid RegistrationDTO dto) {

        Registration entity = modelMapper.map(dto, Registration.class);
        entity = registrationService.save(entity);

        return modelMapper.map(entity, RegistrationDTO.class);
    }

}
