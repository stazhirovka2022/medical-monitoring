package liga.medical.medicalmonitoring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto extends AbstractDto {

    private String name;

    private Integer age;

    private String address;

    private OffsetDateTime birthdayDt;

    private String registration;

    private String passportSeries;

    private String passportNumber;

    private String phoneNumber;

//    private MedicalHistory medicalHistory;

}
