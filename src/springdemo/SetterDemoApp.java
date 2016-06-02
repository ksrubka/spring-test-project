package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Beata Iłowiecka on 02.06.16.
 */
public class SetterDemoApp {

    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean form spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        //call methods on the bean
        //close the context
    }
}
