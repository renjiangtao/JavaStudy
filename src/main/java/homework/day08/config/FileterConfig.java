package homework.day08.config;

import homework.day08.filter.MyWebFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileterConfig {

    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyWebFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
