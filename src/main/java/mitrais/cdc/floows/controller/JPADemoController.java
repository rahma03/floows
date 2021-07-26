package mitrais.cdc.floows.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: JPADemoController.java, v 0.1 2021-07-23 9:27
 */
@Controller
public class JPADemoController {
    @RequestMapping("/")
    public String home()
    {
        return "home.jsp";
    }
}
