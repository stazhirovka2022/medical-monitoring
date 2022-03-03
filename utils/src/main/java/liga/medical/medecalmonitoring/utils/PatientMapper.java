package liga.medical.medecalmonitoring.utils;

import liga.medical.medicalmonitoring.core.model.Patient;
import liga.medical.medicalmonitoring.dto.PatientDto;
import org.modelmapper.ModelMapper;

import java.util.Objects;

public class PatientMapper {

    ModelMapper modelMapper;

    public Patient toEntity(PatientDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, Patient.class);
    }

    public PatientDto toDto(Patient entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, PatientDto.class);
    }
}
