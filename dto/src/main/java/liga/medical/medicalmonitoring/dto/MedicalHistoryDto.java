package liga.medical.medicalmonitoring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalHistoryDto {

    @Id
    private Long id;

    private String docNumber;

    private OffsetDateTime createDttm;

    private OffsetDateTime modifyDttm;

    private String doctor;

    private String diagnosis;

}
