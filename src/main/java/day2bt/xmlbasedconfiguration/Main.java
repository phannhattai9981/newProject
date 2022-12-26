package day2bt.xmlbasedconfiguration;

import day2bt.Pojo.Compa;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   public static void main(String[] args){
       ClassPathXmlApplicationContext appli = new ClassPathXmlApplicationContext("day2btxml/beans.xml");
       Compa studentService = appli.getBean("compa", Compa.class);
       studentService.painting(1L, "Tai", 2.4);
   }
}
