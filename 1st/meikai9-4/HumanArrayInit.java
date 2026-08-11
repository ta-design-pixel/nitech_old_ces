// mainメソッドを含むHumanArrayInitクラスを書く

public class HumanArrayInit{
    public static void main(String [] args){
        Day x = new Day(2000,3,9);
        Day y = new Day(1980,7,12);
        Day z = new Day(2010 , 6,30);
        Human[] a = {new Human("一郎", 150.5, 40.2, "男",x),
                     new Human("二郎", 170.9, 80.1, "男",y),
                     new Human("花子", 160.4, 50.9, "女",z)
                     };

        Human[] b = new Human[3];
        b[0] = new Human("一郎", 150.5, 40.2, "男",x);
        b[1] = new Human("二郎", 170.9, 80.1, "男",y);
        b[2] = new Human("花子", 160.4, 50.9, "女",z);

		for (int i = 0; i < a.length; i++) {
			System.out.print("a["+i+']');
            a[i].putSpec();
            System.out.println(",誕生日"+a[i]);
		}
        System.out.println("");
       	for (int i = 0; i < b.length; i++) {
			System.out.print("b["+i+']');
            b[i].putSpec();
            System.out.println(",誕生日"+b[i]);
		} 
    }
}
