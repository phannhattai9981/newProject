package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public  static  void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Account acc1 = context.getBean("account1", Account.class);
        Account acc2 = context.getBean("account2", Account.class);

        System.out.println("Data of Account 1:");
        System.out.println("Id: "+ acc1.getId());
        System.out.println("Id: "+ acc2.getId());
        System.out.println("OwnerName: " +acc1.getOwnerName());
        System.out.println("OwnerName: " +acc2.getOwnerName());
    }
}
