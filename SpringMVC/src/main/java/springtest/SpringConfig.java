package springtest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springtest")
@PropertySource("classpath:filmPlayer.properties")
public class SpringConfig {

}
