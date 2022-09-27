package org.NoXMLExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimApp
{
    public static void main( String[] args )
    {
        //read Config java class
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
       // Coach theCoach =context.getBean("swimCoach",Coach.class);
        swimCoach theCoach1 =context.getBean("swimCoach",swimCoach.class);

     //   System.out.println(theCoach.getDailyWorkout());
     //   System.out.println(theCoach.getDailyFortune());
      //call our new mwthod swim coach .... has the props values injected
        System.out.println("email: "+theCoach1.getEmail());
        System.out.println("team :"+theCoach1.getTeam());
        context.close();
    }
}