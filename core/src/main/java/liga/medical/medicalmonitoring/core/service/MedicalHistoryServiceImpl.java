package liga.medical.medicalmonitoring.core.service;

import liga.medical.medicalmonitoring.core.mapper.MedicalHistoryMapper;
import liga.medical.medicalmonitoring.dto.MedicalHistoryDto;
import org.springframework.stereotype.Service;
import liga.medical.medicalmonitoring.core.repository.MedicalHistoryDtoRepository;
import liga.medical.medicalmonitoring.core.repository.MedicalHistoryRepository;

@Service
public class MedicalHistoryServiceImpl {

    private final MedicalHistoryRepository repository;
    private final MedicalHistoryDtoRepository dtoRepository;
    private final MedicalHistoryMapper mapper;

    public MedicalHistoryServiceImpl(MedicalHistoryRepository medicalHistoryRepository,
                                     MedicalHistoryDtoRepository dtoRepository, MedicalHistoryMapper mapper) {
        this.repository = medicalHistoryRepository;
        this.dtoRepository = dtoRepository;
        this.mapper = mapper;
    }

    public MedicalHistoryDto save(MedicalHistoryDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }
    
}
