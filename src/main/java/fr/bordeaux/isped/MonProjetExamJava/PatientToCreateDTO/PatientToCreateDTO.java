package fr.bordeaux.isped.MonProjetExamJava.PatientToCreateDTO;

import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.GenderEnum;
import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatientToCreateDTO {

    private List<Integer> parentsIds = new ArrayList<>(2);
    private String firstname;
    private String lastname;
    private GenderEnum gender;
    private LocalDate birthdate;
    private String birthplace;



    //Constructor


    public PatientToCreateDTO() {
    }


    //Getters and setters


    public List<Integer> getParentsIds() {
        return parentsIds;
    }

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

    public void setParentsIds(List<Integer> parentsIds) {
        this.parentsIds = parentsIds;
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


    public PatientDomain convertCreateDtoToPatient (List<Integer> parentIds,
                                                    String allele1Parent1,
                                                    String allele2Parent1,
                                                    String allele1Parent2,
                                                    String allele2Parent2) {

        PatientDomain patient = new PatientDomain();

        patient.setParentsIds(parentIds);
        patient.setFirstname(this.getFirstname());
        patient.setLastname(this.getLastname());
        patient.setBirthdate(this.getBirthdate());
        patient.setBirthplace(this.getBirthplace());
        patient.setGender(this.getGender().name());

        patient.setFirstAllele(RandomStringChooser.chooseRandomString(allele1Parent1, allele2Parent1 ));
        patient.setSecondAllele(RandomStringChooser.chooseRandomString(allele1Parent2,allele2Parent2));


        return patient;



    }



















}
