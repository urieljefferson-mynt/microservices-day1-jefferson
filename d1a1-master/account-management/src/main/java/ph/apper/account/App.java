package ph.apper.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(AccountController.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        SpringApplication.run(App.class, args);
    }
}





