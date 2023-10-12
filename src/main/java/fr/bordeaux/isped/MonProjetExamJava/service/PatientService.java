package fr.bordeaux.isped.MonProjetExamJava.service;

import fr.bordeaux.isped.MonProjetExamJava.CountByGender.ICountByGender;
import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.PatientToCreateDTO.PatientToCreateDTO;
import fr.bordeaux.isped.MonProjetExamJava.PersonalizedException.PersonalizedException;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import fr.bordeaux.isped.MonProjetExamJava.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public PatientDomain addPatient(PatientDTO patientDto) {

        PatientDomain patientDomain=  patientDto.convertDTOtoPatient( patientDto);

        patientRepository.save(patientDomain);

        return patientDomain;


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


    public void createPatient(PatientToCreateDTO patientToCreateDTO){


        Integer idParent1 = patientToCreateDTO.getParent1Id();
        Integer idParent2 = patientToCreateDTO.getParent2Id();

        //On recupère les deux allèles du premier parent
        String firstAlleleParent1 = patientRepository.findById(idParent1).orElseThrow().getFirstAllele();
        String secondAlleleParent1 = patientRepository.findById(idParent1).orElseThrow().getSecondAllele();


        String firstAlleleParent2 = patientRepository.findById(idParent2).orElseThrow().getFirstAllele();
        String secondAlleleParent2 = patientRepository.findById(idParent2).orElseThrow().getSecondAllele();



        //On enregistre le patient dans la base
        patientRepository.save(patientToCreateDTO.convertCreateDtoToPatient(patientToCreateDTO.getParent1Id(),
                                                                            patientToCreateDTO.getParent2Id(),
                                                                            firstAlleleParent1,
                                                                            secondAlleleParent1,
                                                                            firstAlleleParent2,
                                                                            secondAlleleParent2));




    }





}


















