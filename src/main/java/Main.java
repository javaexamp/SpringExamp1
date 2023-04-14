import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Message bean =
                (Message) applicationContext.getBean("message");
        System.out.println(bean.getMessage());
    }
}