import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * 项目启动的入口<br>
 */
@SpringBootApplication
@ComponentScan(basePackages = { "client" })
@PropertySource({ "classpath:application.properties" })
@ImportResource({"classpath:applicationContext.xml"})
public class ServiceApplication {

    public static void main(String args[]) throws InterruptedException {
        SpringApplication.run(ServiceApplication.class, args);
        System.out.println("======service success=====");
        Thread.currentThread().join();
    }
    
}
