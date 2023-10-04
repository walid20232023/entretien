package fr.bordeaux.isped.MonProjetExamJava.web;

import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.PatientDTO;
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

    @GetMapping("api/id")
    public Optional<PatientDomain> getPatientById(Integer id) {

        return patientService.getPatientById(id);
    }

    @PostMapping("api/patient")
    public void addPatient(@RequestBody PatientDTO patientDto) {
        patientService.addPatient(patientDto);

    }

    @DeleteMapping("api/delete")
    public void deletePatient(Integer id) {

        patientService.deletePatient(id);

    }

}


