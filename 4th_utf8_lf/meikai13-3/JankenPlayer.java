// 抽象クラスJankenPlayerを書く
public abstract class JankenPlayer{
    public abstract String toString();

    public abstract int hand();
    
    public void print(){
        System.out.println(toString());
    }
}