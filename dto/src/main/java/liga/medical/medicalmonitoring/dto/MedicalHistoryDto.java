package liga.medical.medicalmonitoring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalHistoryDto extends AbstractDto {

//    private Patient patient;

    private String docNumber;

    private OffsetDateTime createDttm;

    private OffsetDateTime modifyDttm;

    private String doctor;

    private String diagnosis;

//    private MedicalHistory medicalHistory;
}
