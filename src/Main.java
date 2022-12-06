import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        Starter starter = new Starter();
        RunnerMess1 runnerMess1 =new RunnerMess1(starter);
        RunnerMess2 runnerMess2 =new RunnerMess2(starter);
        RunnerMess3 runnerMess3 =new RunnerMess3(starter);
        while (true) {
            new Thread(runnerMess1).start();
            new Thread(runnerMess2).start();
            new Thread(runnerMess3).start();
        }



    }
}
