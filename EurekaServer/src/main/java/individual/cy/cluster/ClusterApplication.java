package individual.cy.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2018/1/5 10:40
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class ClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClusterApplication.class, args);
	}
}
