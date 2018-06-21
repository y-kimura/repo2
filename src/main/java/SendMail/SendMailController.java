package SendMail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SendMailController {
    @GetMapping
    public String getHello() {
        return "hello";
    }

    @RequestMapping("/omikuji_output")
    public String omikujiOutput(ModelMap modelMap, @RequestParam("name") String name) {
        String result = "吉";
        if (Math.random() < 0.5) {
            result = "大吉";
        }
        modelMap.addAttribute("result", result);
        modelMap.addAttribute("name", name);
        return "omikuji_output";
    }
}
