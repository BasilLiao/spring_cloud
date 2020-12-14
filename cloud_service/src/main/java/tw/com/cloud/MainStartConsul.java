package tw.com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@PropertySource("classpath:setting.properties")
@SpringBootApplication
@EnableDiscoveryClient
/**
 * 啟動器 Cloud
 */
public class MainStartConsul {
	public static void main(String[] args) {
		SpringApplication.run(MainStartConsul.class, args);
	}
}