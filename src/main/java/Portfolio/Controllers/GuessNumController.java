package Portfolio.Controllers;

import Portfolio.Applications.GuessNum.GuessNum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.InputMismatchException;
import java.util.Random;

@Controller
@RequestMapping(value = "/")

public class GuessNumController {

    @RequestMapping(value = "guessNum", method = RequestMethod.POST)

    public String takeDigit(int digit, Model model) {

        return "guessNum/guessNum";
    }

    @RequestMapping(value = "askPlayer", method = RequestMethod.POST)
    public String askPlayer() {


        return "guessNum/guessNum";
    }

}
