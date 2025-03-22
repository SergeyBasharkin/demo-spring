package pro.sky.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import pro.sky.demospring.printer.ByePrinter;
import pro.sky.demospring.printer.HelloPrinter;
import pro.sky.demospring.printer.Printer;

@SpringBootApplication
@Configuration
@EnableScheduling
public class DemoSpringApplication {

//    @Value("${app.printer}")
//    private String printer;
//
//    @Scheduled(fixedDelay = 2000)
//    public void print() {
//        System.out.println("alive");
//    }

//    @Bean
//    public Printer printer() {
//        if (printer.equals("bye")) {
//            return new ByePrinter();
//        }
//
//        if (printer.equals("hello")) {
//            return new HelloPrinter();
//        }
//
//        return System.out::println;
//    }


    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);

//        HashMap<String, Object> applicationContext = new HashMap<>();
//        applicationContext.put("printer", new Printer());
//        applicationContext.put("bootstrap", new Bootstrap((Printer) applicationContext.get("printer")));
//
//        applicationContext.values().stream()
//            .filter(CommandLineRunner.class::isInstance)
//            .map(CommandLineRunner.class::cast)
//            .forEach(it -> {
//                try {
//                    it.run(args);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            });
    }

}
