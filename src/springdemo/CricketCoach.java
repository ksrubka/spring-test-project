package springdemo;

/**
 * Created by Beata Iłowiecka on 02.06.16.
 */
public class CricketCoach implements Coach {

    FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Cricketoach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
}