import static java.lang.Thread.sleep;

public class Starter implements Runnable {
    private final int period;
    private int seconds = 0;

    public Starter(int period) {
        this.period = period;
    }


    public int getSeconds() {
        return seconds;
    }


    @Override
    public void run() {
        while (true) {
            try {
                sleep(period * 1000L);
                synchronized (this) {
                    seconds++;
                    //System.out.println("Период - " + period + " = " +seconds + "c.");
                    this.notifyAll();
                }
            } catch (InterruptedException e) {
                System.out.println("Starter InterruptedException");
                e.printStackTrace();
            }
        }
    }
}
