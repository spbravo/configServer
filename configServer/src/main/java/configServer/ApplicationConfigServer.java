package configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ApplicationConfigServer {

    public static void main(String[] args) {
    	System.out.println(" Argumentos "+args[0]);   	
        SpringApplication.run(ApplicationConfigServer.class, args);
        
    }
}