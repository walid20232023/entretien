package fr.bordeaux.isped.MonProjetExamJava.service;

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

    public void addPatient(PatientDomain patientDomain) {
        patientRepository.save( patientDomain) ;
    }


    public void deletePatient(Integer patientId) {

        patientRepository.deleteById(patientId);
    }
}