package SendMail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SendMailController {
    @GetMapping
    public String getHello() {
        return "hello";
    }

    @Autowired
    private AppProperties prop;

    @RequestMapping("/omikuji_output")
    public String omikujiOutput(ModelMap modelMap, @RequestBody InputData param) {

        String result = prop.getTest();
        modelMap.addAttribute("result", result);
        modelMap.addAttribute("name", param.name);
        return "omikuji_output";
    }
}
