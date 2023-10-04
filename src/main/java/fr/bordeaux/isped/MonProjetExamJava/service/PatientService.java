package fr.bordeaux.isped.MonProjetExamJava.service;

import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import fr.bordeaux.isped.MonProjetExamJava.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;
    public Optional<PatientDomain> getPatientById(Integer id) {
        return patientRepository.findById(id);

    }

    public void addPatient(PatientDTO patientDto) {
        patientRepository.save( patientDto.convertDTOtoPatient(patientDto)) ;
    }


    public void deletePatient(Integer id) {

        patientRepository.deleteById(id);
    }
}

