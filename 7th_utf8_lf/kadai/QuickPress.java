// 課題のプログラムを作成する。
// RandomTimer クラスおよびメインの QuickPress クラスを作成する。
import java.util.Random;
import java.util.Scanner;
class RandomTimer extends Thread{
    Random rand = new Random();
    double count = 0;
    boolean running = true;

    RandomTimer(double countMax){
        count = rand.nextDouble(countMax);
    }

    public void run(){
        boolean first = true;
        while(running){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            count -= 10;
            if(count < 0 && first){
                System.out.print("*");
                first = false;
            }
        }
    }
    public double responseTime(){
        return -count;
    }
    public void stopRunning(){
        running = false;
    }
}

public class QuickPress {
    public static void main(String[] args) {
        RandomTimer t = new RandomTimer(5000);
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Hit Enter to start:"); 
        stdIn.nextLine();
        t.start();
        stdIn.nextLine();
        System.out.println("Your time:"+t.responseTime());
        t.stopRunning();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.print(e);
        }
    }
}