package fr.bordeaux.isped.MonProjetExamJava.PatientToCreateDTO;

import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.GenderEnum;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatientToCreateDTO {


    private Integer parent1Id;
    private Integer parent2Id;
    private String firstname;
    private String lastname;
    private GenderEnum gender;
    private LocalDate birthdate;
    private String birthplace;



    //Constructor


    public PatientToCreateDTO() {
    }


    //Getters and setters



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

    public Integer getParent1Id() {
        return parent1Id;
    }

    public Integer getParent2Id() {
        return parent2Id;
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

    public void setParent1Id(Integer parent1Id) {
        this.parent1Id = parent1Id;
    }

    public void setParent2Id(Integer parent2Id) {
        this.parent2Id = parent2Id;
    }

    public PatientDomain convertCreateDtoToPatient (Integer parent1Id,
                                                    Integer parent2Id,
                                                    String allele1Parent1,
                                                    String allele2Parent1,
                                                    String allele1Parent2,
                                                    String allele2Parent2) {
       //On crée un patient vide
        PatientDomain patient = new PatientDomain();
       //On affecte les Id
        patient.setParent1Id(parent1Id);
        patient.setParent2Id(parent2Id);
        patient.setFirstname(this.getFirstname());
        patient.setLastname(this.getLastname());
        patient.setBirthdate(this.getBirthdate());
        patient.setBirthplace(this.getBirthplace());
        patient.setGender(this.getGender().name());
        //On affecte les allèles du groupe sanguin choisis de façon aléatoire
        patient.setFirstAllele(RandomStringChooser.chooseRandomString(allele1Parent1, allele2Parent1 ));
        patient.setSecondAllele(RandomStringChooser.chooseRandomString(allele1Parent2,allele2Parent2));

        return patient;



    }



















}
