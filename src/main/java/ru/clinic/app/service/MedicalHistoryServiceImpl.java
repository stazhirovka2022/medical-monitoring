package ru.clinic.app.service;

import org.springframework.stereotype.Service;
import ru.clinic.app.dto.MedicalHistoryDto;
import ru.clinic.app.repository.MedicalHistoryDtoRepository;
import ru.clinic.app.repository.MedicalHistoryRepository;
import ru.clinic.app.utils.MedicalHistoryMapper;

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

    public MedicalHistoryDto findById(Long id) {
        return mapper.toDto(repository.findById(id));
    }

}
