package fr.bordeaux.isped.MonProjetExamJava.service;

import fr.bordeaux.isped.MonProjetExamJava.CountByGender.ICountByGender;
import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.PatientToCreateDTO.PatientToCreate;
import fr.bordeaux.isped.MonProjetExamJava.PatientToCreateDTO.RandomStringChooser;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import fr.bordeaux.isped.MonProjetExamJava.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.Random;


@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public void addPatient(PatientDTO patientDto) {
        patientRepository.save(patientDto.convertDTOtoPatient());
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


    public void createPatient(PatientToCreate patientToCreate){


        Integer idParent1 = patientToCreate.getParentsIds().get(0);
        Integer idParent2 = patientToCreate.getParentsIds().get(1);

        //On recupère les deux allèles du premier parent
        String firstAlleleParent1 = patientRepository.findById(idParent1).orElseThrow().getFirstAllele();
        String secondAlleleParent1 = patientRepository.findById(idParent1).orElseThrow().getSecondAllele();


        String firstAlleleParent2 = patientRepository.findById(idParent2).orElseThrow().getFirstAllele();
        String secondAlleleParent2 = patientRepository.findById(idParent2).orElseThrow().getSecondAllele();



        //On enregistre le patient dans la base
        patientRepository.save(patientToCreate.convertCreateDtoToPatient(patientToCreate.getParentsIds(),
                                                                          firstAlleleParent1,
                                                                          secondAlleleParent1,
                                                                          firstAlleleParent2,
                                                                          secondAlleleParent2));




    }





}


















