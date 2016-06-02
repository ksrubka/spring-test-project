package springdemo;

/**
 * Created by Beata Iłowiecka on 02.06.16.
 */
public class CricketCoach implements Coach {

    FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Cricketcoach: inside no-arg constructor");
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
        this.fortuneService = fortuneService;
    }
}