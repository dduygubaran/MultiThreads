public class Counter implements Runnable {

    public String name;
    public int id;
    public boolean isRun = true;

    public Counter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        int i = 1;
        while (isRun) {
            System.out.println(this.name + " : " + i++);

//              Threadi id'si kadar beklet
            try {
                Thread.sleep(1000 * this.id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        isRun = false;

    }
}
