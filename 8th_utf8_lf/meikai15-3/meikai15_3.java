// 以下に必要な記述を追加せよ

public class meikai15_3{
    public static void main(String[] args){

		System.out.print("文字列s1：");  String s1 = "ABCDEFGHI"; System.out.println(s1);
		System.out.print("文字列s2：");  String s2 = "EFG"; System.out.println(s2);

		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1中にs2は含まれません。");
		else
			System.out.println("s1:"+s1);
            System.out.print("s2:");
            for(int i=0; i < idx; i++){
                System.out.print(" ");}
            System.out.println(s2);
    }
}
