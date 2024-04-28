package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.sms.entity.patient;
import net.javaguides.sms.service.patientService;

@Controller
public class patientController {
	
	
	private patientService patientService;

	public patientController(net.javaguides.sms.service.patientService patientService) {
		super();
		this.patientService = patientService;
	}
	
@RequestMapping(value = "/login", method = RequestMethod.GET)
    
    public String loginPage() {
		return "login";
    }
@RequestMapping(value = "/login", method = RequestMethod.POST)
    
    public String patientPage(ModelMap model,@RequestParam String userId, @RequestParam String pasword) {
	if (userId.equals("admin") && pasword.equals("root")) {
		model.addAttribute("patients", patientService.getAllPatients());
		return "patients";
	}
	model.put("errorMsg","please enter correct");
		return "login";
    }

	//handler method to handle list patient and return mode and view
	@GetMapping("/patients")
	public String listPatient(Model model) {
		model.addAttribute("patients", patientService.getAllPatients());
		return "patients";
		
			
	}

	@GetMapping("/patients/new")
	public String createPatientForm(Model model) {
		
		//create patient object to hold patient form data
		patient patient = new patient();
		model.addAttribute("patient", patient);
		return "create_patient";
		
	}
	
	@PostMapping("/patients")
	public String savePatient(@ModelAttribute("patient")patient patient ) {
		
		patientService.savePatient(patient);
		return "redirect:/patients";
	}
	
	@GetMapping("/patients/edit/{id}")
	public String editPatientForm(@PathVariable Long id, Model model) {
		model.addAttribute("patient", patientService.getPatientById(id));
		return "edit_patient";
	}
	
	
	
	@PostMapping("/patients/{id}")
	public String updatePatient(@PathVariable  Long id,
			@ModelAttribute("patient") patient patient,
			Model model) {
		
		//get patient from database by  id
		
		patient existingPatient = patientService.getPatientById(id);
		existingPatient.setId(patient.getId());
		existingPatient.setFirstname(patient.getFirstname());
		existingPatient.setLastname(patient.getLastname());
		existingPatient.setEmail(patient.getEmail());
		existingPatient.setPhone(patient.getPhone());
		existingPatient.setAge(patient.getAge());
		existingPatient.setGender(patient.getGender());
		existingPatient.setRoom_no(patient.getRoom_no());
		

		
			
		// save updated patient object
		patientService.updatePatient(existingPatient);
		return "redirect:/patients";
		
	}
	
	@GetMapping("/patients/{id}")
	public String deletePatient(@PathVariable Long id) {
	    patientService.deletePatientById(id);
	    return "redirect:/patients";
	}

}
