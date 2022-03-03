package liga.medical.medicalmonitoring.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import liga.medical.medicalmonitoring.core.model.MedicalHistory;

import java.util.List;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<Long, MedicalHistory> {

    MedicalHistory findById(Long id);

    MedicalHistory findByName(String name);

    List<MedicalHistory> getAll();

    MedicalHistory save(MedicalHistory medicalHistory);

    void update(MedicalHistory medicalHistory);

    void deleteById(Long id);
}
