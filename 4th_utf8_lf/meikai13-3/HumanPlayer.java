// 人間プレーヤを表すサブクラスHumanPlayerを書く
public class HumanPlayer extends JankenPlayer{
    int a;

    public HumanPlayer(int a){
        this.a = a;
    }

    public int hand(){
        return a;
    }

    public String toString(){
        switch(a){
            case 1: return "人：グー";
            case 2: return "人：チョキ";
            case 3: return "人：パー";
            default: return "エラー";
        }
    }
}