

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan(basePackages= {"Test_Btpn"})
@EnableJpaRepositories(basePackages = {"Test_Btpn.Dao"})
@EntityScan(basePackages="Test_Btpn.Model")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
