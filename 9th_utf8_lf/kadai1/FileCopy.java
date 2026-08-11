// 以下に必要な記述を追加せよ

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法: java FileCopy コピー元ファイル コピー先ファイル");
            System.exit(0);
        }

        String srcFilename = args[0];
        String dstFilename = args[1];

        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFilename));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dstFilename));

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
            System.out.println(srcFilename + " を " + dstFilename + " にコピーしました。");

        } catch (FileNotFoundException e) {
            System.out.println("エラー: ファイルが見つからないか、アクセスできません。");
        } catch (IOException e) {
            System.out.println("エラー: 入出力エラーが発生しました。");
        }
    }
}
