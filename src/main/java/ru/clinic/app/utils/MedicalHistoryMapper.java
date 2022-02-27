package ru.clinic.app.utils;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.clinic.app.dto.MedicalHistoryDto;
import ru.clinic.app.model.MedicalHistory;

import java.util.Objects;

@Component
public class MedicalHistoryMapper {

    @Autowired
    ModelMapper modelMapper;

    public MedicalHistory toEntity(MedicalHistoryDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, MedicalHistory.class);
    }

    public MedicalHistoryDto toDto(MedicalHistory entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, MedicalHistoryDto.class);
    }
}
