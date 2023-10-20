package fr.bordeaux.isped.MonProjetExamJava.service;

import fr.bordeaux.isped.MonProjetExamJava.repository.ICountByGender;
import fr.bordeaux.isped.MonProjetExamJava.DTO.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.DTO.PatientToCreateDTO;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import fr.bordeaux.isped.MonProjetExamJava.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public PatientDomain addPatient(PatientDTO patientDto) {
        PatientDomain patientDomain= patientDto.convertDTOtoPatient();
        return  patientRepository.save(patientDomain);
    }

    public Optional<PatientDomain> findPatientById(Integer id) {
       return  patientRepository.findById(id);
    }

    public Iterable<PatientDomain> getAllPatients(org.springframework.data.domain.Pageable page) {
        return patientRepository.findAll();
    }

    public List<ICountByGender> countByGender() {
        return patientRepository.countByGender();
    }

    public PatientDomain createPatient(PatientToCreateDTO patientToCreateDTO){
        //On convertit le patientToCreateDTO en PatientDomain
        PatientDomain createdPatient = patientToCreateDTO.convertCreateDtoToPatient();

        //On recupère les deux allèles de chaque parent
        String firstAlleleParent1 = patientRepository.findById(createdPatient.getParent1Id()).orElseThrow().getFirstAllele();
        String secondAlleleParent1 = patientRepository.findById(createdPatient.getParent1Id()).orElseThrow().getSecondAllele();

        String firstAlleleParent2 = patientRepository.findById(createdPatient.getParent2Id()).orElseThrow().getFirstAllele();
        String secondAlleleParent2 = patientRepository.findById(createdPatient.getParent2Id()).orElseThrow().getSecondAllele();

        //On code les allèles de l'enfant qu'on lui attribue ensuite
        createdPatient.setFirstAllele(RandomStringChooser.chooseRandomString( firstAlleleParent1, secondAlleleParent1));
        createdPatient.setSecondAllele(RandomStringChooser.chooseRandomString(firstAlleleParent2, secondAlleleParent2));

        return patientRepository.save(createdPatient);

    }


}


















