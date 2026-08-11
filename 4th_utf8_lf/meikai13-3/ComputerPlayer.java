// コンピュータプレーヤを表すサブクラスComputerPlayerを書く
import java.util.Random;
public class ComputerPlayer extends JankenPlayer{
    Random rand = new Random();
    int a;

    public ComputerPlayer() {
        this.a = rand.nextInt(3) + 1;
    }

    public int hand(){
        return a;
    }

    public String toString(){
        switch(a){
            case 1: return "コンピュータ：グー";
            case 2: return "コンピュータ：チョキ";
            case 3: return "コンピュータ：パー";
            default: return "エラー";
        }
    }
}