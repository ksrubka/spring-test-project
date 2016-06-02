package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class HelloSpringApp {

    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}





















