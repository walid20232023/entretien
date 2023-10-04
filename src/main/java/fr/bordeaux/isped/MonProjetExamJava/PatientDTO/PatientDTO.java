package fr.bordeaux.isped.MonProjetExamJava.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;

import java.time.LocalDate;

public class PatientDTO {

    private String firstname;
    private String lastname;
    private GenderEnum  gender;
    private LocalDate birthdate;
    private String birthplace;
    private AlleleEnum firstAllele;
    private AlleleEnum secondAllele;
    // Variable de stockage du groupe sanguin
    private String bloodGroup;


    //Constructeur du DTO

    public PatientDTO() {
    }


    //Getter et Setter



    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public AlleleEnum getFirstAllele() {
        return firstAllele;
    }

    public AlleleEnum getSecondAllele() {
        return secondAllele;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }



    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public void setFirstAllele(AlleleEnum firstAllele) {
        this.firstAllele = firstAllele;
    }

    public void setSecondAllele(AlleleEnum secondAllele) {
        this.secondAllele = secondAllele;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }




    //Methode pour convertir un PatientDomain en PatientDTO

    public PatientDTO convertPatientToDto(PatientDomain patient) {

        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setFirstname(patient.getFirstname());
        patientDTO.setLastname(patient.getLastname().toUpperCase());
        patientDTO.setBirthdate(patient.getBirthdate());
        patientDTO.setBirthplace(patient.getBirthplace());
        if (patient.getGender()== 1) {
            patientDTO.setGender(GenderEnum.MALE);;
        } else if (patient.getGender() == 2) {
            patientDTO.setGender(GenderEnum.FEMALE);;
        }

        patientDTO.setFirstAllele(AlleleEnum.valueOf(patient.getFirstAllele()));
        patientDTO.setSecondAllele(AlleleEnum.valueOf(patient.getSecondAllele()));

        patientDTO.setBloodGroup(patient.getFirstAllele()+ patient.getSecondAllele());
        return patientDTO;





    }




    //Méthode pour convertir un PatientDTO en PatientDomain
    public PatientDomain convertDTOtoPatient (PatientDTO patientDto) {

        PatientDomain patient = new PatientDomain();
        patient.setFirstname(patientDto.getFirstname());
        patient.setLastname(patientDto.getLastname());
        patient.setBirthdate(patientDto.getBirthdate());
        patient.setBirthplace(patientDto.getBirthplace());

        if (patientDto.getGender()== GenderEnum.MALE) {
            patient.setGender(1);
        } else if (patientDto.getGender()== GenderEnum.FEMALE) {
            patient.setGender(2);
        }

        patient.setFirstAllele(patientDto.getFirstAllele().name());
        patient.setSecondAllele(patientDto.getSecondAllele().name());

         return patient;



    }















}


