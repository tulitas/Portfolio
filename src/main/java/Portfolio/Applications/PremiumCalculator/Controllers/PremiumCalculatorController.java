package Portfolio.Applications.PremiumCalculator.Controllers;

import Portfolio.Applications.PremiumCalculator.Policy.PolicyCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class PremiumCalculatorController {

    @RequestMapping(value = "/premiumCalculator" , method = RequestMethod.POST)
    public  String askSum(double sumWater, double sumFire, Model model) {


         PolicyCalculator policyCalculator = new PolicyCalculator();
         policyCalculator.run(sumFire, sumWater);

        double premiumFlatFire = policyCalculator.getPremiumFire();
        model.addAttribute("premiumFlatFire", premiumFlatFire);

        return "premiumCalculator/result";
    }

}
