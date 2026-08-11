// 問題16-6のクラスを Runnable インタフェースを実装して作る
public class ThreadTest2{

    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        Thread TH1 = new Thread(th1);
        Thread TH2 = new Thread(th2);
        TH2.start();
        TH1.start();
    }
}

class Thread1 implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
                System.out.println("***");
        }
    }
}

class Thread2 implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("=====");
        }
    }
}
