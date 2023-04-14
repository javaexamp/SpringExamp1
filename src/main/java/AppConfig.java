import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="message")
    public Message getMessage() {
        Message message = new Message();
        message.setMessage("Hello!");
        return message;
    }
}