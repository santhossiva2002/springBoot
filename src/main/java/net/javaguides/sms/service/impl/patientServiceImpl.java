package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.patient;
import net.javaguides.sms.repository.patientRepository;
import net.javaguides.sms.service.patientService;

@Service

public class patientServiceImpl implements patientService {
	
	private patientRepository patientRepository;
	
	

	public patientServiceImpl(net.javaguides.sms.repository.patientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}



	@Override
	public List<patient> getAllPatients() {
		
		return patientRepository.findAll();
	}



	@Override
	public patient savePatient(patient patient) {
		
		return patientRepository.save(patient);
	}



	@Override
	public patient getPatientById(Long id) {
		return patientRepository.findById(id).get();	
	}

	@Override
	public patient updatePatient(patient patient) {
		return patientRepository.save(patient);
	}



	@Override
	public void deletePatientById(Long id) {
		patientRepository.deleteById(id);
		
	}

}
