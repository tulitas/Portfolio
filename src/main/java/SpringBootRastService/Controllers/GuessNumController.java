package SpringBootRastService.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class GuessNumController {
    @RequestMapping(value = "guessNum/digit", method = RequestMethod.POST)
    public String getDigit(int digit, Model model) {
        System.out.println("Guess Num controller");
        return "guessNum";
    }



}
