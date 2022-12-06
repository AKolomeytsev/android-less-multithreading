public class RunnerMess3 implements Runnable {
    Starter starter;
    public RunnerMess3(Starter starter) {
        this.starter = starter;
    }

    @Override
    public void run() {
        try {
            starter.messager3();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}