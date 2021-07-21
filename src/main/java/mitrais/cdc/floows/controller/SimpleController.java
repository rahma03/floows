package mitrais.cdc.floows.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: SimpleController.java, v 0.1 2021-07-16 11:18
 */
@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("appName",appName);
        return "home";
    }
}
