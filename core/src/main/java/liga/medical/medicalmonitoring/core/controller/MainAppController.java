package liga.medical.medicalmonitoring.core.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainAppController {

    @GetMapping("/")
    public String homePage(Model model) {
        String dtNow = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(LocalDateTime.now());
        model.addAttribute("dtnow", dtNow);
        return "home";
    }
}
