package Portfolio.Controllers;

import Portfolio.Applications.GuessNum.GuessNum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class GuessNumController {
    @RequestMapping(value = "guessNum", method = RequestMethod.POST)
    public String getDigit(int digit, Model model) {
        GuessNum guessNum = new GuessNum();
        guessNum.chekNum(digit);
        return "guessNum/guessNum";
    }



}
