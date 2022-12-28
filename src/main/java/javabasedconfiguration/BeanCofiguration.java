package javabasedconfiguration;

import day2.Pojo.AccountServiceImpl;
import day2.Pojo.AcountRepo;
import day2.Pojo.AcountRepoImpl;
import day2.Pojo.AcountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCofiguration {
    @Bean
    public AcountService acountService() {
        AccountServiceImpl baen = new AccountServiceImpl();
        baen.setAcountRepo(accountDao());
        return baen;

    }

    @Bean
    public AcountRepo accountDao(){
        AcountRepoImpl baen = new AcountRepoImpl();
        return baen;
    };

}
