package priv.hhhhhtao.helloworldclouduser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloWorldCloudUserApplication {

    private final static Logger logger = LoggerFactory.getLogger(HelloWorldCloudUserApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldCloudUserApplication.class, args);
        logger.info("user run success");
    }

}
