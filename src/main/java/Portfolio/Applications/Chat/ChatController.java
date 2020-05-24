package Portfolio.Applications.Chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class ChatController {
    @RequestMapping(value = "connection")
    public String connection() {
        ChatConnection connection = new ChatConnection();
        connection.go();
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
        return "connectionsApp/chat";
    }
}
