package advantage_demo.utils;

import static java.util.concurrent.TimeUnit.SECONDS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.time.StopWatch;

public class Timer implements Interaction {

  private long time;

  public Timer(long time) {
    this.time = time;
  }

  @Override
  @Step("{0} waits #time second(s)")
  public <T extends Actor> void performAs(T actor) {
    StopWatch stopWatch = new StopWatch();
    long timer;
    stopWatch.start();

    do {
      timer = stopWatch.getTime(SECONDS);
      if (timer > time) {
        stopWatch.stop();
        break;
      }
    } while (true);
  }

  public static Performable inSeconds(long time) {
    return Tasks.instrumented(Timer.class, time);
  }
}
