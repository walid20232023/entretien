package fr.bordeaux.isped.MonProjetExamJava.service;

import fr.bordeaux.isped.MonProjetExamJava.CountByGender.ICountByGender;
import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import fr.bordeaux.isped.MonProjetExamJava.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;


@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public void addPatient(PatientDTO patientDto) {
        patientRepository.save(PatientDTO.convertDTOtoPatient(patientDto));
    }


    public Optional<PatientDomain> findPatientById(Integer id) {

        return patientRepository.findById(id);

    }

    public Iterable<PatientDomain> getAllPatients(org.springframework.data.domain.Pageable page) {
        return patientRepository.findAll();
    }


    public List<ICountByGender> countByGender() {

        return patientRepository.countByGender();
    }
}


















