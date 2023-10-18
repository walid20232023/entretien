package fr.bordeaux.isped.MonProjetExamJava.repository;


import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository  extends JpaRepository<PatientDomain,Integer> {

    @Query(value = "SELECT COUNT(*) genderCount, patient_gender gender FROM exam_inf201.patient GROUP BY patient_gender",
            nativeQuery = true)
    List<ICountByGender> countByGender();


}

