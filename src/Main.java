import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*Watek1 watek1 = new Watek1();
        Watek2 watek2 = new Watek2();
        WatekRunnable watekRunnable = new WatekRunnable();
        watek1.start();
        watek2.start();
        new Thread(watekRunnable).start();*/

        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(3);

        threadPool.schedule(new WatekRunnable(), 1, TimeUnit.SECONDS);
        threadPool.schedule(new WatekRunnable2(), 1, TimeUnit.SECONDS);
        threadPool.schedule(new WatekRunnable3(), 1, TimeUnit.SECONDS);

        threadPool.shutdown();
    }
}
