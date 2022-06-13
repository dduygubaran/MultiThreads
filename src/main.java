public class main {
    public static void main(String[] args) throws InterruptedException {

        //Thread oluşturma - Runnable Sınıfı Üzerinden

        Counter c1 = new Counter("c1",1); //Nesne oluşturuldu
        Counter c2 = new Counter("c2",1);
        Counter c3 = new Counter("c3",5);

        Thread t1 = new Thread(c1); //Thread içerisine atandı
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        Thread.sleep(3000); //3 sn sonra dur
        c1.stop();

        t3.start();

        t2.start();
        Thread.sleep(8000); //8 saniye sonra dur
        c2.stop();
    }
}
