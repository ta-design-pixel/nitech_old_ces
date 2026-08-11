// 以下に必要な記述を追加せよ

public class SumOfArgs{
    public static void main(String[] args){
        double sum = 0.0;
		for (String arg : args)
			sum += Double.parseDouble(arg);
		System.out.println("合計は" + sum + "です。");
	return;
    }
}
