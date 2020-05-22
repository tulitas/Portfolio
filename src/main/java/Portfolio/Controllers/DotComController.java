package Portfolio.Controllers;

import Portfolio.Applications.DotComBust.DotComBust;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DotComController {
    @RequestMapping(value = "dotCom")
    public String runDotCom() {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
        return "index";
    }
}
