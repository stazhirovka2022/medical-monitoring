package liga.medical.medicalmonitoring.api;

import liga.medical.medicalmonitoring.dto.MedicalHistoryDto;

public interface MedicalHistoryService {

    MedicalHistoryDto findById(Long id);

    MedicalHistoryDto save(MedicalHistoryDto medicalHistory);

}
