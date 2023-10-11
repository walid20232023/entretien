package fr.bordeaux.isped.MonProjetExamJava.web;

import fr.bordeaux.isped.MonProjetExamJava.CountByGender.ICountByGender;
import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.PatientToCreateDTO.PatientToCreateDTO;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import fr.bordeaux.isped.MonProjetExamJava.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping


public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("api/patient")
    public PatientDomain addPatient(@RequestBody PatientDTO patientDto) {
       return patientService.addPatient(patientDto);


    }


    @GetMapping("api/patient/{id}")
    public ResponseEntity<PatientDomain> findById(@PathVariable(name = "id") Integer id) {
        Optional<PatientDomain> patient = patientService.findPatientById(id);
        if(patient.isEmpty()){
            return new ResponseEntity<PatientDomain>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<PatientDomain>(patient.get(), HttpStatus.OK);
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
    public void createPatient(PatientToCreateDTO patientToCreateDTO) {
        patientService.createPatient(patientToCreateDTO);

    }










}


