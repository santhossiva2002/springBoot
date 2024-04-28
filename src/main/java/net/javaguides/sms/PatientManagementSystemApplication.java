package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import net.javaguides.sms.entity.patient;
import net.javaguides.sms.repository.patientRepository;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

public class PatientManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatientManagementSystemApplication.class, args);
	}

	@Autowired
	private patientRepository patientRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*patient patient1 = new patient("ramesh", "kummar", "ramesh@gmail.com");
		patientRepository.save(patient1);*/
		
		
	}

}
