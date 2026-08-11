// 以下に必要な記述を追加せよ

public class meikai15_6{
    public static void main(String[] args){
        for(int i=0; i < args.length; i++){
            double r = Double.parseDouble(args[i]);
            System.out.println("円周:" + 2*r*Math.PI);
            System.out.println("面積:" + r*r*Math.PI);
        }
	return;
    }
}
