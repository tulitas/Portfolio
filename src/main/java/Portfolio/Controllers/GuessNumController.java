package Portfolio.Controllers;

import Portfolio.Applications.GuessNum.ChekNum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/")

public class GuessNumController {


    @RequestMapping(value = "guessNum", method = RequestMethod.POST)

    public String takeDigit(int digit, Model model) {
        ChekNum chekNum = new ChekNum();
        chekNum.runMyNum(digit);
        String result = chekNum.getAskResult();

        model.addAttribute("palyerDigit", digit);
        model.addAttribute("result", result);
        System.out.println(result);
        return "guessNum/result";
    }

    @RequestMapping(value = "askPlayerName", method = RequestMethod.POST)
    public String askPlayerName(String name, Model model) {
        model.addAttribute("playerName", name);
        return "guessNum/guessNum";
    }

    @RequestMapping(value = "askPlayer", method = RequestMethod.POST)
    public String askPlayer(String ask, Model model) {
        model.addAttribute("ask", ask);
        return "guessNum/askPlayerName";
    }

    @RequestMapping(value = "result", method = RequestMethod.GET)
    public String result (Model model){

        return "guessNum/result";
    }

}
