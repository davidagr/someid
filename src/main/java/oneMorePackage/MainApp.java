package oneMorePackage;
import starter2.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApp {
    @Autowired
    private Sender sender;
    @Autowired
    private SomeClass some;
    @Autowired
    private SomeClass1 some1;
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Bean
    public CommandLineRunner afterStart() {
        return (args) -> {
            //sender.send("some message");
            some.someMethod(1);
            some.someMethod(3);
//            some1.someMethod(3);

        };
    }
}
