// サブクラス/実装クラスSkinnableRobotPetを書く
public class SkinnableRobotPet extends Pet implements Skinnable{
	public SkinnableRobotPet(String name) {
		super(name);		
	}

	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。"); 
	}

    public void changeSkin(int skin) {					
		System.out.print("スキンを");
		switch (skin) {
		 case BLACK:   System.out.print("漆黒");  break;
		 case RED:     System.out.print("深紅");  break;
		 case GREEN:   System.out.print("柳葉");  break;
		 case BLUE:    System.out.print("露草");  break;
		 case LEOPARD: System.out.print("豹柄");  break;
		 default:      System.out.print("無地");  break;
		}
		System.out.println("に変更しました。");
	}	
}