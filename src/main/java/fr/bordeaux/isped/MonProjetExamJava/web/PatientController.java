package fr.bordeaux.isped.MonProjetExamJava.web;

import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import fr.bordeaux.isped.MonProjetExamJava.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping


public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("api/patient")
    public String test() {

        return "hello";
    }

    @GetMapping("api/id")
    public Optional<PatientDomain> getPatientById(Integer id) {

        return patientService.getPatientById(id);
    }

    @PostMapping("api/client")
    public void addPatient(PatientDomain patientDomain) {

        patientService.addPatient(patientDomain);


    }

    @DeleteMapping("api/delete")
    public void deletePatient(Integer patientId) {

        patientService.deletePatient(patientId);

    }

}


