package com.asterdio.common; /**
 * Created by Admin on 11/24/2016.
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
//
//        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//        obj.printHello();

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        Triangle triangle=(Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
