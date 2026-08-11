// Humanクラスを書く
public class Human {
    private String namae;
    private double sintyo;
    private double taizyu;
    private String seibetu;
    private int year = 0;
    private int month = 0;
    private int date = 0;


    public Human(String namae, double sintyo, double taizyu, String seibetu ,int y, int m, int d){
        this.namae = namae;
        this.sintyo = sintyo;
        this.taizyu = taizyu;
        this.seibetu = seibetu;
        year = y;
        month = m;
        date = d;
    }

    void putSpec() {
        System.out.print(namae+ ','+ sintyo + ',' + taizyu + ',' + seibetu);
    }
}
