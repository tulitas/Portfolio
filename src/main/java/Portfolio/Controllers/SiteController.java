package Portfolio.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class SiteController {
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping("/ticTacToe")
    public ModelAndView XO() {
        return new ModelAndView("ticTacToe");
    }

    @RequestMapping(value = "/palindrom")
    public ModelAndView Palindrom() {
        return new ModelAndView("palindrome/palindrom");
    }

    @RequestMapping(value = "/guessNum")
    public ModelAndView GuessNum() {
        return new ModelAndView("guessNum/guessNum");
    }

    @RequestMapping(value = "/askPlayer")
    public ModelAndView askPlayer() {
        return new ModelAndView("guessNum/askPlayer");
    }
}
