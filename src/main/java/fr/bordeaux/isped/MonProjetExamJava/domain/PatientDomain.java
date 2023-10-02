package fr.bordeaux.isped.MonProjetExamJava.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabpatient", schema = "patient")
public class PatientDomain {
    @Id
    @Column(name = "patient_id")
    private Integer patientId;

    @Column(name = "patient_name")
    private String patientName;

    public PatientDomain() {
    }

    public Integer getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
