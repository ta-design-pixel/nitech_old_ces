// 問題16-6のクラスを Thread クラスの拡張クラスとして作る

public class ThreadTest1 extends Thread {

    public static void main(String[] args) {
        new Thread2().start();
        new Thread1().start();
    }
}

class Thread1 extends Thread {

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

class Thread2 extends Thread {

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
