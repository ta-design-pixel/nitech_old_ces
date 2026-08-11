// 以下に必要な記述を追加せよ

public class meikai15_1{
    public static void main(String[] args){
        String a = "ABCDE";
        char[] b = new char[a.length()];
        String A = "";

        for(int i=0; i < a.length() ; i++){
            b[i] = a.charAt(i);
        }
        for(int i=0; i < a.length() ; i++){
            A += b[a.length() - i - 1 ];
        }
        System.out.println(A);
        return;
    }
}
