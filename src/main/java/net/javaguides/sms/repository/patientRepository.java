package net.javaguides.sms.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.patient;


public interface patientRepository extends JpaRepository<patient, Long> {

	
	

}
