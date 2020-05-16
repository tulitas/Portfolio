package Portfolio.Applications.PremiumCalculator.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class PremiumCalculatorController {

    @RequestMapping(value = "/premiumCalculator" , method = RequestMethod.POST)
    public  String askSum(int sum) {


        return "premiumCalculator/premiumCalculator";
    }

}
