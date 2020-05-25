package Portfolio.Applications.NumberToString;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class NumberToString {

    @RequestMapping(value = "numberToString", method = RequestMethod.GET)
    public String getNum(Integer num, Model model) {
        System.out.println("num");
        return "numberToString/numberToString";
    }

}
