public class RunnerMess1 implements Runnable{
    Starter starter;
    public RunnerMess1(Starter starter) {
        this.starter = starter;
    }

    @Override
    public void run() {
        try {
            starter.messager1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
