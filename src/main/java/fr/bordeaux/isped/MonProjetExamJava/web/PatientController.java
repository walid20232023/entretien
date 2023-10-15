package fr.bordeaux.isped.MonProjetExamJava.web;

import fr.bordeaux.isped.MonProjetExamJava.repository.ICountByGender;
import fr.bordeaux.isped.MonProjetExamJava.DTO.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.DTO.PatientToCreateDTO;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import fr.bordeaux.isped.MonProjetExamJava.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping

public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("api/patient")
    public PatientDomain addPatient(@RequestBody PatientDTO patientDto) {

       return patientService.addPatient(patientDto);

    }

    @GetMapping("api/patient/{id}")
    public Optional<PatientDomain> findById(@PathVariable(name = "id") Integer id) {
       return  patientService.findPatientById(id);
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
    public PatientDomain createPatient(PatientToCreateDTO patientToCreateDTO) {
       return patientService.createPatient(patientToCreateDTO);

    }










}


