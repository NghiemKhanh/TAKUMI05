package vn.com.vti.job_site;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@MapperScan("vn.com.vti.job_site.mapper")
public class AppFront {
	public static void main(String[] args) {
		SpringApplication.run(AppFront.class, args);
	}
}
