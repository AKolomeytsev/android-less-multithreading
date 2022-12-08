public class Main {
    public static void main(String[] args) {
        Starter starter = new Starter(1);
        //Starter starter1 = new Starter(5);
        //Starter starter2 = new Starter(7);
        RunnerMess runnerMess =new RunnerMess(starter);
        //RunnerMess runnerMess1 =new RunnerMess(starter1);
        //RunnerMess runnerMess2 =new RunnerMess(starter2);

        starter.run();
        //starter1.run();
        //starter2.run();

        runnerMess.run();
        //runnerMess1.run();
        //runnerMess2.run();






    }
}
