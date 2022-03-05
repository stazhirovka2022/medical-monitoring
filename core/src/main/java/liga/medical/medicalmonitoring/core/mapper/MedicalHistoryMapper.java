package liga.medical.medicalmonitoring.core.mapper;

import liga.medical.medicalmonitoring.core.model.MedicalHistory;
import liga.medical.medicalmonitoring.dto.MedicalHistoryDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class MedicalHistoryMapper {

    ModelMapper modelMapper = MappingUtils.modelMapper();

    public MedicalHistory toEntity(MedicalHistoryDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, MedicalHistory.class);
    }

    public MedicalHistoryDto toDto(MedicalHistory entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, MedicalHistoryDto.class);
    }
}
