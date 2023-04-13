import java.util.Objects;

public class DeadlockScenario {

    public void main(String[] args) throws InterruptedException{

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
        Thread t2 = new Thread(new SyncThread(obj1, obj3), "t1");
        Thread t3 = new Thread(new SyncThread(obj3, obj1), "t1");

        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();


    }
    class SyncThread implements Runnable{
        private Object obj1;
        private Object obj2;

        public SyncThread(Object obj1, Object obj2) {
            this.obj1 = obj1;
            this.obj2 = obj2;
        }

        @Override
        public void run() {
            String name = Thread.currentThread().getName();

            System.out.println(name + " acquiring lock on " + obj1);
            work();
            System.out.println(name + " acquiring lock on " + obj2);

            synchronized (obj2){
                System.out.println(name + " acquiring lock on " + obj2);
                work();
            }
            System.out.println(name + " released lock on " + obj1);
            System.out.println(name + " finished execution..");
        }
        private void work(){
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
