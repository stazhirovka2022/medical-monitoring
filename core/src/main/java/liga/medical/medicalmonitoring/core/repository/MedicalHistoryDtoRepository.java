package liga.medical.medicalmonitoring.core.repository;

import liga.medical.medicalmonitoring.dto.MedicalHistoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalHistoryDtoRepository extends JpaRepository<Long, MedicalHistoryDto> {

    MedicalHistoryDto save(MedicalHistoryDto medicalHistory);

    MedicalHistoryDto findById(Long id);
}
