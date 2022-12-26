package day2.xmlbasedconfiguration;

import day2.Pojo.Account;
import day2.Pojo.AccountServiceImpl;
import day2.Pojo.AcountService;
import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlbaseconfiguration/beans.xml");
        AcountService acountService = applicationContext.getBean("acountService", AcountService.class);

        System.out.println("BEFORE MONEY TRANSFER");
        System.out.println("Acount 1 balence : " + acountService.getAccount(1).getBalance());
        System.out.println("Acount 2 balence : " + acountService.getAccount(2).getBalance());

        acountService.transferMoney(1, 2 , 5.0);
        System.out.println("===============");
        System.out.println("after money transfer");
        System.out.println("Acount 1 balence : " + acountService.getAccount(1).getBalance());
        System.out.println("Acount 2 balence : " + acountService.getAccount(2).getBalance());


    }
}
