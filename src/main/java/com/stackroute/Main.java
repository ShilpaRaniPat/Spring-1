package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movieA = (Movie) beanFactory.getBean("movie1");
//        System.out.println(movieA.getActor());

//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movieB = (Movie)((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie2");
//        System.out.println(movieB.getActor());
//
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movieC = (Movie)context.getBean("movie3");
        Movie movieD = (Movie)context.getBean("movie3");
        Movie movieE = (Movie)context.getBean("movie2");
        System.out.println(movieC.getActor());
        System.out.println(movieD == movieC);

        System.out.println(movieE.getActor());


    }
}





