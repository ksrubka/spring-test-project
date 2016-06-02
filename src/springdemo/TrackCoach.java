package springdemo;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 4k";
    }

    @Override
    public String getDailyFortune() {
        return "Just get daily fortune: " + fortuneService.getFortune();
    }
}
