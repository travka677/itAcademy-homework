package by.itAcademy.homework.les15_io;
/*
6 Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
Для этого использовать рекурсию
 */

import java.io.File;

public class Task6 {
    public static void main(String[] args) {
        File file = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "ЦТ");

        printListOfFiles(file);
    }

    public static void printListOfFiles(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files == null) {
                return;
            }
            for (File file: files) {
                if (file.isDirectory()) {
                    System.out.println();
                    printListOfFiles(file);
                } else {
                    System.out.println(file.getPath());
                }
            }
        } else if (directory.isFile()) {
            System.out.println(directory.getPath() + "\t" + directory.getName());
        }
    }
}
