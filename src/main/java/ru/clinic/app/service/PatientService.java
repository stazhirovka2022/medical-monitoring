package ru.clinic.app.service;

import ru.clinic.app.dto.MedicalHistoryDto;
import ru.clinic.app.dto.PatientDto;
import ru.clinic.app.repository.MedicalHistoryDtoRepository;
import ru.clinic.app.repository.PatientDtoRepository;

public interface PatientService extends PatientDtoRepository {

    PatientDto findByName(String name);

    PatientDto save(PatientDto patientDto);

}