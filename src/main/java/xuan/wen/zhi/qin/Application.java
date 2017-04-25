package xuan.wen.zhi.qin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by qinzhiwenxuan on 2017/4/20.
 */
@EnableEurekaServer
@SpringBootApplication
@MapperScan("xuan.wen.zhi.qin.domain.repository")
public class Application {
	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args);
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}
