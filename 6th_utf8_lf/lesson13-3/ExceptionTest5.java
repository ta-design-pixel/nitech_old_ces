// ExceptionTest5 のプログラムを修正したものを書く
public class ExceptionTest5 {
    public static void main(String[] args) {
        try {
            method1(0);
            method2(0);
            method3(0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("例外:" + e);
        }
    }
    static void method1(int x) throws Exception {
        if( x < 0){
            throw new Exception();
        }
    }
    static void method2(int x) throws Exception {
        if( x == 0){
            throw new Exception();
        }
    }
    static void method3(int x) throws Exception {
        if( 0 < x){
            throw new Exception();
        }
    }
}
