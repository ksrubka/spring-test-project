package springdemo;

/**
 * Created by Beata Iłowiecka on 02.06.16.
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is Your happy day!";
    }
}
