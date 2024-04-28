package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.patient;

public interface patientService {
	List<patient> getAllPatients();
	
   patient savePatient(patient patient);
   
   patient getPatientById(Long id);
   patient updatePatient(patient patient);
   
   
   void deletePatientById(Long id);
}
