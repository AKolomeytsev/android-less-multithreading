import static java.lang.Thread.sleep;

public class Starter {
    int seconds = 0;
    public synchronized void messager1() throws InterruptedException {
        wait(1000l);
        //sleep(1000l);
        seconds++;
        System.out.println("Прошло - " + seconds + "секунд. Поток №1");
        notify();
    }

    public synchronized void messager2() throws InterruptedException {
        wait(5000l);
        //sleep(5000l);
        seconds++;
        System.out.println("Прошло - " + seconds + "секунд. Поток №2");
        notify();

    }

    public synchronized void  messager3() throws InterruptedException {
        wait(7000l);
        sleep(7000l);
        seconds++;
        System.out.println("Прошло - " + seconds + "секунд. Поток №3");
        notify();
    }
}
