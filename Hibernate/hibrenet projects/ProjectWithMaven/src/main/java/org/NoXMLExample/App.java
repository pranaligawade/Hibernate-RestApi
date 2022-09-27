package org.NoXMLExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //read Config java class
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach =context.getBean("tennisCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        context.close();
    }
}