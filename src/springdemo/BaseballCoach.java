package springdemo;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 40 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
