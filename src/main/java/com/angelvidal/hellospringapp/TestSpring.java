/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angelvidal.hellospringapp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 *
 * @author angvidal
 */
public class TestSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String configFile="src/main/java/spring.xml";
        ApplicationContext ctx = new FileSystemXmlApplicationContext(configFile);
        HHelloBean bean = ctx.getBean(HHelloBean.class);
        String msg = bean.hello();
        System.out.println("Message====>"+msg);
    }
}
