package beanlifecycle;

import day2.Pojo.AcountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("baenslifecycle/beans.xml");
        BeansLifeCycle beansLifeCycle = applicationContext.getBean(BeansLifeCycle.class);
        applicationContext.close();

    }
}
