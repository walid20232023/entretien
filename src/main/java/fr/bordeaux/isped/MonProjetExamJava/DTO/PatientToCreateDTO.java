package fr.bordeaux.isped.MonProjetExamJava.DTO;

import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;

import java.time.LocalDate;

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

    public PatientDomain convertCreateDtoToPatient () {
       //On crée un patient vide
        PatientDomain patientDomain = new PatientDomain();

        //On affecte les attributs
        patientDomain.setParent1Id(this.getParent1Id());
        patientDomain.setParent2Id(this.getParent2Id());
        patientDomain.setFirstname(this.getFirstname());
        patientDomain.setLastname(this.getLastname());
        patientDomain.setBirthdate(this.getBirthdate());
        patientDomain.setBirthplace(this.getBirthplace());
        patientDomain.setGender(this.getGender().name());

        return patientDomain;



    }



















}
