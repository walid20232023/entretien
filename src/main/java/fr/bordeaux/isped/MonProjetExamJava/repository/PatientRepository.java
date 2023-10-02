package fr.bordeaux.isped.MonProjetExamJava.repository;


import fr.bordeaux.isped.MonProjetExamJava.domain.PatientDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository  extends JpaRepository<PatientDomain,Integer> {
}
