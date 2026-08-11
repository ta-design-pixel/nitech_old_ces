// Humanクラスを書く
public class Human {
    private String namae;
    private double sintyo;
    private double taizyu;
    private String seibetu;
    private Day birth;


    public Human(String namae, double sintyo, double taizyu, String seibetu ,Day b){
        this.namae = namae;
        this.sintyo = sintyo;
        this.taizyu = taizyu;
        this.seibetu = seibetu;
        birth = b;
        }

    void putSpec() {
        System.out.print(namae+ ','+ sintyo + ',' + taizyu + ',' + seibetu);
    }
    public String toString() {
		return String.format("%04d年%02d月%02d日", birth.getYear(), birth.getMonth(), birth.getDay());
	}

}
