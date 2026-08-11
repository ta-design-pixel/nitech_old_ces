// クラスPetを書く
// サブクラスPetを書く
// 資料に従って一部を省略しても良い
public class Pet {
	private String name;						

	public Pet(String name) {
		this.name = name;									
	}

	public String getName() { return name; }

	public void introduce() {
		System.out.println("■僕の名前は" + name + "です！"); 
	}
}