package fr.bordeaux.isped.MonProjetExamJava.web;

import fr.bordeaux.isped.MonProjetExamJava.CountByGender.ICountByGender;
import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.PatientToCreateDTO.PatientToCreate;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import fr.bordeaux.isped.MonProjetExamJava.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping


public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("api/patient")
    public void addPatient(@RequestBody PatientDTO patientDto) {
        patientService.addPatient(patientDto);

    }


    @GetMapping("api/patient/{id}")
    public Optional<PatientDomain> findById(@PathVariable(name = "id") Integer id) {
        return patientService.findPatientById(id);
    }

    @GetMapping("api/patient/all")
    public Iterable<PatientDomain> getAllPatients(org.springframework.data.domain.Pageable page) {

      return   patientService.getAllPatients(page);

    }


    @GetMapping("api/patient/count")
    public List<ICountByGender>  countByGender() {

        return   patientService.countByGender();

    }


    @PostMapping("api/patient/create")
    public void createPatient(PatientToCreate patientToCreate) {
        patientService.createPatient(patientToCreate);

    }










}


