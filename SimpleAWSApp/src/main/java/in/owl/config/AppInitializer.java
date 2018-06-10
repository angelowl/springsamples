package in.owl.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import in.owl.app.ApplicationStartup;

@EnableAutoConfiguration
public class AppInitializer extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(ApplicationStartup.class);
		return builder;	
	}
	
	
}
