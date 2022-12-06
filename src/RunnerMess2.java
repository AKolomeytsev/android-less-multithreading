public class RunnerMess2 implements Runnable {
    Starter starter;
    public RunnerMess2(Starter starter) {
        this.starter = starter;
    }

    @Override
    public void run() {
        try {
            starter.messager2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
