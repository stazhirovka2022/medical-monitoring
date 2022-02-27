package ru.clinic.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.clinic.app.dto.MedicalHistoryDto;
import ru.clinic.app.model.MedicalHistory;

@Repository
public interface MedicalHistoryDtoRepository extends JpaRepository<Long, MedicalHistoryDto> {

    MedicalHistoryDto save(MedicalHistoryDto medicalHistory);

    MedicalHistoryDto findById(Long id);
}
