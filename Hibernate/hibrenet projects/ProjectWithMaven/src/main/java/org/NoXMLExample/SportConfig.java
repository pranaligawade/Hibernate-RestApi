package org.NoXMLExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:sport.properties")
public class SportConfig {
// define bean for our sad fortune service
    @Bean
     public  FortuneService sadFortuneService(){
         return  new SadFortuneService();
     }

    // defin bean for our swim coach and inject dependaency
    @Bean
    public  Coach swimCoach(){
        return  new swimCoach(sadFortuneService());
    }

}
