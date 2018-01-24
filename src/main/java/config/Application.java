package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import dao.AdminRepository;
import entities.Admin;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "dao")
@EntityScan(basePackages = "entities")
public class Application extends  SpringBootServletInitializer implements CommandLineRunner{

	
	@Autowired
	private AdminRepository adminRepository;
	
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		
		//adminRepository.save(new Admin("aymen.chla@gmail.com","azerty"));
		
	}
    
    
    
    
}