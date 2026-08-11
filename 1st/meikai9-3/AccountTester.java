// mainメソッドを含むAccountTesterクラスを書く
public class AccountTester{
    public static void main(String [] args){
        Day d = new Day(1987,3,9);
        Account yamada = new Account("山田","123456",10000, d);
        System.out.println("口座名義:" + yamada.getName());
		System.out.println("口座番号:" + yamada.getNo());
		System.out.println("預金残高:" + yamada.getBalance());
        System.out.println("口座開設日:"+ yamada);

    }
}
