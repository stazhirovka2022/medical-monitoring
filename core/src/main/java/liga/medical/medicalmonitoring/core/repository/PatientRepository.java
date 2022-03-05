package liga.medical.medicalmonitoring.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import liga.medical.medicalmonitoring.core.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
