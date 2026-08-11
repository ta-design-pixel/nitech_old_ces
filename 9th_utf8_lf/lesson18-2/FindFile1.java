// 以下に必要な記述を追加せよ
import java.io.* ;

public class FindFile1{
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("使用方法: java FindFiel1 検索文字列 検索ファイル");
            System.exit(0);
        }

        String findString = args[0];
        String filename = args[1];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int lineNum = 1;
            while ((line = reader.readLine()) != null){
                if(line.indexOf(findString) >= 0){
                    System.out.println(lineNum + ":" + line);
                }
                lineNum += 1;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
