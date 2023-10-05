package fr.bordeaux.isped.MonProjetExamJava.domain;


import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.AlleleEnum;
import fr.bordeaux.isped.MonProjetExamJava.PatientDTO.GenderEnum;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@Entity
@Table(name = "patient", schema = "exam_inf201")
public class PatientDomain {
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "patient_gender")
    private String  gender;

    @Column(name = "birth_date")
    private LocalDate birthdate;

    @Column(name = "birth_place")
    private String birthplace;
    @Column(name = "first_allele")
    private String firstAllele;

    @Column(name = "second_allele")
    private String secondAllele;

    @Transient
    private String bloodGroup;
    public PatientDomain() {
    }

    public Integer getId() {
        return id;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getBloodGroup() {
        return this.firstAllele + this.secondAllele;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getFirstAllele() {
        return firstAllele;
    }

    public String getSecondAllele() {
        return secondAllele;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setFirstAllele(String firstAllele) {
        this.firstAllele = firstAllele;
    }

    public void setSecondAllele(String secondAllele) {
        this.secondAllele = secondAllele;
    }




}
