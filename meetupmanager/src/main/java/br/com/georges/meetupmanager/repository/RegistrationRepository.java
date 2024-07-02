package br.com.georges.meetupmanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.georges.meetupmanager.model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer>{
	
	boolean existsByRegistration(String registration);

    Optional<Registration> findByRegistration(String registrationAtrb);

}
