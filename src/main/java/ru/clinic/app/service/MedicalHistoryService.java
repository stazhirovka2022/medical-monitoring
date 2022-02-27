package ru.clinic.app.service;

import ru.clinic.app.dto.MedicalHistoryDto;
import ru.clinic.app.model.MedicalHistory;
import ru.clinic.app.repository.MedicalHistoryDtoRepository;
import ru.clinic.app.repository.MedicalHistoryRepository;

import java.util.List;

public interface MedicalHistoryService extends MedicalHistoryDtoRepository {

    MedicalHistoryDto findById(Long id);

    MedicalHistoryDto save(MedicalHistoryDto medicalHistory);

}
