package fr.bordeaux.isped.MonProjetExamJava.domain;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "patient", schema = "exam_inf201")
public class PatientDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "parents_ids")
    private List<Integer> parentsIds = new ArrayList<>(2);


    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "patient_gender")
    private String gender;

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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Integer> getParentsIds() {
        return parentsIds;
    }

    public void setParentsIds(List<Integer> parentsIds) {
        this.parentsIds = parentsIds;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getBloodGroup() {
        return this.firstAllele + this.secondAllele;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getFirstAllele() {
        return firstAllele;
    }

    public void setFirstAllele(String firstAllele) {
        this.firstAllele = firstAllele;
    }

    public String getSecondAllele() {
        return secondAllele;
    }

    public void setSecondAllele(String secondAllele) {
        this.secondAllele = secondAllele;
    }


}
