// 連番クラスIdを書く
class Id {
	static int counter = 0;		

	private int id;				

	public Id() {
		id = ++counter;			
	}
	public int getId() {
		return id;
	}
    static int getMaxId(){
        return counter ;
    }
}
// mainメソッドを含むIdTesterクラスを書く

public class IdTester {
    public static void main(String[] args){
    Id a = new Id();		
    Id b = new Id();

    System.out.println("counter = " + Id.getMaxId());
    }

}