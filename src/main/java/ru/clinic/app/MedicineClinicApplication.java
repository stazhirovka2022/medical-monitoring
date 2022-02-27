package ru.clinic.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(value = "ru.clinic.app.mainapp")
public class MedicineClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicineClinicApplication.class, args);
    }

}
