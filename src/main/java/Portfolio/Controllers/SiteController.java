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

    @RequestMapping(value = "/askPlayerName")
    public ModelAndView askPlayerName() {
        return new ModelAndView("guessNum/askPlayerName");
    }
    @RequestMapping(value = "/result")
    public ModelAndView result() {
        return new ModelAndView("guessNum/result");
    }

    @RequestMapping(value = "/addnew")
    public ModelAndView addNew() {
        return new ModelAndView("calendar/addnew");
    }

    @RequestMapping(value = "/create")
    public ModelAndView added() {
        return new ModelAndView("calendar/create");
    }


    @RequestMapping(value = "/edit")
    public ModelAndView edit() {
        return new ModelAndView("calendar/edit");
    }

    @RequestMapping(value = "/month")
    public ModelAndView month() {
        return new ModelAndView("calendar/month");
    }
}
