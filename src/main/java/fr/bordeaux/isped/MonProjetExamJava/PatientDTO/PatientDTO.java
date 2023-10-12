package fr.bordeaux.isped.MonProjetExamJava.PatientDTO;
import fr.bordeaux.isped.MonProjetExamJava.PersonalizedException.PersonalizedException;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;

import java.time.LocalDate;
import java.util.Optional;

public class PatientDTO {

    private String firstname;
    private String lastname;
    private GenderEnum gender;
    private LocalDate birthdate;
    private String birthplace;
    private AlleleEnum firstAllele;
    private AlleleEnum secondAllele;




    //Constructeur du DTO

    public PatientDTO() {
    }

    //public static PatientDTO convertPatientToDto(Optional<PatientDomain> byId) {

    //    return null;
   // }


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



    //Méthode pour convertir un PatientDTO en PatientDomain
   /* public PatientDomain convertDTOtoPatient () {

        PatientDomain patient = new PatientDomain();

        patient.setFirstname(this.getFirstname());
        patient.setLastname(this.getLastname());
        patient.setBirthdate(this.getBirthdate());
        patient.setBirthplace(this.getBirthplace());
        patient.setGender(this.getGender().name());
        patient.setFirstAllele(this.getFirstAllele().name());
        patient.setSecondAllele(this.getSecondAllele().name());

         return patient;

    }*/



    public  PatientDomain convertDTOtoPatient (PatientDTO patientDTO) {

        PatientDomain patient = new PatientDomain();

        patient.setFirstname( patientDTO.getFirstname());
        patient.setLastname(this.getLastname());
        patient.setBirthdate(this.getBirthdate());
        patient.setBirthplace(this.getBirthplace());
        patient.setGender(this.getGender().name());
        patient.setFirstAllele(this.getFirstAllele().name());
        patient.setSecondAllele(this.getSecondAllele().name());

       return patient;














    }














}


