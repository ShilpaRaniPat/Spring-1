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
    public static void main(String[] args){
        //Movie movie=new Movie();


        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("bean.xml"));
        Movie movie1=(Movie) beanFactory.getBean("movie");
        System.out.println(movie1.getActor());


        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("bean.xml"));
        Movie movie2=((DefaultListableBeanFactory) beanDefinitionRegistry).getBean(Movie.class);
        System.out.println(movie2.getActor());

        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Movie movie3=context.getBean(Movie.class);
        System.out.println(movie3.getActor());









    }



}

