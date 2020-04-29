package Portfolio.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping(value = "/")

public class GuessNumController {

    @RequestMapping(value = "guessNum", method = RequestMethod.POST)

    public String takeDigit(int digit, Model model) {

        return "guessNum/guessNum";

    }

//    @RequestMapping(value = "askPlayer", method = RequestMethod.GET)
//    public String askPlayer() {
//
//
//        return "guessNum/askPlayerName";
//    }

    @RequestMapping(value = "askPlayerName", method = RequestMethod.POST)
    public String askPlayerName(String name, Model model) {
        model.addAttribute("playerName", name);
        System.out.println(model);
        return "guessNum/guessNum";
    }






}
