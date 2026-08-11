// 以下に必要な記述を追加せよ

public class meikai15_2{
    public static void main(String[] args){
        String a = "ABCDE";

        for(int i=0; i < a.length() ; i++){
            char b = a.charAt(i);
            System.out.print((int)b);
            System.out.print(',');
        }
        System.out.println();
        return;
    }
}
