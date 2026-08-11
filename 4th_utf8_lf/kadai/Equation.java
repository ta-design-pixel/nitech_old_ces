// 抽象クラスEquationを書く
public abstract class Equation{
    protected String name;

    protected void setName(String name){
        this.name = name;
    }
    protected String getName(){
        return name;
    }

    public abstract void print();
    public abstract void solve();
}