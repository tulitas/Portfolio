package Portfolio.Controllers;

import Portfolio.Applications.GuessNum.GuessNum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;
import java.util.List;


@Controller
@RequestMapping(value = "/")

public class GuessNumController {

    @RequestMapping(value = "guessNum", method = RequestMethod.POST)

    public String takeDigit(int digit, String name, Model model) {
        model.addAttribute("palyerDigit", digit);
        GuessNum guessNum = new GuessNum();


            guessNum.runMyNum(digit);


        return "guessNum/guessNum";

    }

    @RequestMapping(value = "askPlayerName", method = RequestMethod.POST)
    public String askPlayerName(String name, Model model) {
        model.addAttribute("playerName", name);
        return "guessNum/guessNum";
    }






}
