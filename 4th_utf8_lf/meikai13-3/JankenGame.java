// mainメソッドを含むJankenGameクラスを書く
import java.util.Scanner;
public class JankenGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0;i < 4; i++){
        int hand = scanner.nextInt();
        JankenPlayer human = new HumanPlayer(hand);
        JankenPlayer computer = new ComputerPlayer();

        human.print();
        computer.print();

        if((human.hand() == 1 && computer.hand() == 2) || (human.hand() == 2 && computer.hand() == 3) || (human.hand() == 3 && computer.hand() == 1 )){
            System.out.println("人の勝利");
        }else if(human.hand() == computer.hand()){
            System.out.println("引き分け");
        }else System.out.println("コンピュータの勝利");
        System.out.println();
    }
    }
}