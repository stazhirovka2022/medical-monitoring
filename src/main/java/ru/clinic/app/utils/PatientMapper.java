package ru.clinic.app.utils;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import ru.clinic.app.dto.PatientDto;
import ru.clinic.app.model.MedicalHistory;
import ru.clinic.app.model.Patient;

import java.util.Objects;

public class PatientMapper {

    @Autowired
    ModelMapper modelMapper;

    public Patient toEntity(PatientDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, Patient.class);
    }

    public PatientDto toDto(Patient entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, PatientDto.class);
    }
}
