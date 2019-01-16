package com.stackroute.domain;

import org.springframework.beans.BeansException;


    public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {

        public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("inside postProcessBeforeInitialization"+beanName);
            return bean;
        }


        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("inside postProcessAfterInitialization " +beanName);
            return bean;
        }
}
