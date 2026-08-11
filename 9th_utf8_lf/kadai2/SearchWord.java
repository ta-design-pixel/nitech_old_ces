// 以下に必要な記述を追加せよ

import java.io.*;

public class SearchWord {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法：java SearchWord ファイル キーワード");
            System.exit(0);
        }
        String filename = args[0];
        String keyword = args[1];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int lineNumber = 1;
            int lineNumberSum = 0;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                int index = line.indexOf(keyword);

                while (index >= 0) {
                    found = true;
                    int charPosition = index + 1 + lineNumberSum;

                    int start = Math.max(0, index - 10);
                    int end = Math.min(line.length(), index + keyword.length() + 10);
                    String context = line.substring(start, end);

                    System.out.println(charPosition + "文字目");
                    System.out.println(lineNumber + ":" + context);

                    index = line.indexOf(keyword, index + 1);
                }
                lineNumberSum += line.length();
                lineNumber++;
            }

            if (!found) {
                System.out.println("キーワード '" + keyword + "' は見つかりませんでした。");
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("エラー: ファイル '" + filename + "' が見つかりません。");
        } catch (IOException e) {
            System.out.println("エラー: 入出力エラーが発生しました。" + e);
        }
    }
}
