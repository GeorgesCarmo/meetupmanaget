package br.com.georges.meetupmanager.service.impl;

import br.com.georges.meetupmanager.model.Registration;

import org.springframework.stereotype.Service;

import br.com.georges.meetupmanager.exception.BusinessException;
import br.com.georges.meetupmanager.repository.RegistrationRepository;
import br.com.georges.meetupmanager.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService{
	
	RegistrationRepository repository;

	public RegistrationServiceImpl(RegistrationRepository repository) {
        this.repository = repository;
    }

    public Registration save(Registration registration) {
        if (repository.existsByRegistration(registration.getRegistration())) {
            throw new BusinessException("Registration Already created");
        }
        return repository.save(registration);
    }

}
