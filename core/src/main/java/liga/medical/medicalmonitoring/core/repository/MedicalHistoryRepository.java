package liga.medical.medicalmonitoring.core.repository;

import liga.medical.medicalmonitoring.core.model.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {

}
