package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<CarObject> cars = new ArrayList<CarObject>();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AutoFactory autoFactory = ctx.getBean("AutoFactory", AutoFactory.class);
        autoFactory.runProduction(cars);
        AutoFactory autoFactory1 = ctx.getBean("AutoFactory1", AutoFactory.class);
        autoFactory1.runProduction(cars);

        System.out.println("Cars built :" +  cars.size());
    }
}
