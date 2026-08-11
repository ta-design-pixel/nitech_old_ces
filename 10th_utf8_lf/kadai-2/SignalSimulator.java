// 課題2のプログラムを作成する
//

import java.util.*;
// 車クラス

class Car {

    private int step;

    public Car(int step) {
        this.step = step;
    }

    public int getStep() {
        return step;
    }
}

// SignalSimulatorクラス
public class SignalSimulator {

    public static void main(String[] args) {

        int sigFreq = Integer.parseInt(args[0]); 
        int carFreq = Integer.parseInt(args[1]); 

        Queue<Car> queue = new LinkedList<>();

        boolean blue = true;      
        int passedCars = 0;
        int totalStep = 0;

        for (int step = 0; step < 10000; step++) {

            if (step % carFreq == 0) {
                queue.offer(new Car(step));
            }

            if (step != 0 && step % sigFreq == 0) {
                blue = !blue;
            }

            if (blue && !queue.isEmpty()) {
                Car car = queue.poll();
                passedCars++;
                totalStep += step - car.getStep();
            }

        }

        System.out.println("通過台数 : " + passedCars);
        System.out.println("平均待ち時間 : " + (double) totalStep / passedCars);
    }
}
