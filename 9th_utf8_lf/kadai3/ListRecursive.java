// 以下に必要な記述を追加せよ

import java.io.*;

public class ListRecursive {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法: java ListRecursive ディレクトリ名");
            System.exit(0);
        }
        String dirname = args[0];
        printList(0, dirname);
    }

    public static void printList(int depth, String dirname) {
        File dir = new File(dirname);
        String[] dirlist = dir.list();

        for (int i = 0; i < dirlist.length; i++) {

            for (int j = 0; j < depth; j++) {
                System.out.print("  ");
            }

            File file = new File(dirname + File.separator + dirlist[i]);

            if (file.isDirectory()) {
                System.out.println(dirlist[i] + "/");
                printList(depth + 1, file.getPath());
            } else {
                System.out.println(dirlist[i]);
            }
        }
    }
}
