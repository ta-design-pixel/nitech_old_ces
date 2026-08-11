// 以下に必要な記述を追加せよ
// 以下の記述は例であるため，変更してもよい

import java.io.File;
import java.util.Scanner;

class Dictionary {

    private int wordNum = 46725;
    // 辞書に含まれる行数

    // 他に課題で必要なフィールドを追加すること
    private int gosu = wordNum;
    private String[] english = new String[gosu];
    private String[] japanese = new String[gosu];

    public Dictionary(String filename) {
        // 講義資料に記載されているものと同じである．
        // 適宜記述を追加すること
        try {
            Scanner scan = new Scanner(new File(filename));
            for (int i = 0; i < wordNum; i++) {
                if (!scan.hasNextLine()) {
                    // 次の行が読み込めない場合の処理
                    // 辞書ファイルが想定よりも短い場合に実行
                    // 通常は実行されない
                    break;
                }
                String line = scan.nextLine();
                // line には1行全ての文字が含まれるため
                // 英単語と和訳に適切に分割して格納すること
                // 以下に記述を追加
                String s1 = "\t";
                int idx = line.indexOf(s1);
                english[i] = "";
                japanese[i] = "";
                for (int j = 0; j < idx; j++) {
                    english[i] += line.charAt(j);
                }
                for (int j = idx + 2; j < line.length(); j++) {
                    japanese[i] += line.charAt(j);
                }
                // これは行が読み込めているかどうかを確認するための表示
                // 不要なので実際の処理では削除すること
                //System.out.println(line);

            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }
    }
    // 以下に Dictionary クラスで指定されたメソッドを追加すること

    public String searchEWord(String word) {
        for (int i = 0; i < gosu; i++) {
            if (word.equals(english[i])) {
                String result = english[i] + ":" + japanese[i];
                return result;
            }
        }
        return null;
    }

    public String searchFEWord(String word) {
        String longest = "";
        String result = null;
        
        for (int i = 0; i < wordNum; i++) {
            if (word.startsWith(english[i]) && word.length() > english[i].length()) {
                if (english[i].length() > longest.length()) {
                    longest = english[i]; 

                    String replacedWord = word.replace(english[i], english[i] + "-");
                    
                    result = (replacedWord + ":" + japanese[i]);
                }
            }
        }
        return result; 
    }

    public String[] searchJWord(String word) {
        String[] results = new String[gosu];
        int c = 0;
        for (int i = 0; i < gosu; i++) {
            int idx2 = japanese[i].indexOf(word);
            if (idx2 >= 0) {
                results[c] = (english[i] + ":" + japanese[i]);
                c += 1;
            }
        }
        if (c > 1) {
            String[] result = new String[c];
            for (int i = 0; i < c; i++) {
                result[i] = results[i];
            }
            return result;
        }
        return null;
    }
}

public class DictionaryTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dict = new Dictionary("ejdic-hand-utf8.txt");
            String a = scanner.nextLine(); 
            if (dict.searchEWord(a) != null) {
                System.out.println(dict.searchEWord(a));
                return;
            }
            
            if (dict.searchFEWord(a) != null) {
                System.out.println(dict.searchFEWord(a));
                return;
            }

            if (dict.searchJWord(a) != null) {
                for (String s : dict.searchJWord(a)) {
                    System.out.println(s);
                }
                return;
            }
    }
}