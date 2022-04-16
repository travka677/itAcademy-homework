package by.itAcademy.homework.les16_serialization;
/*
1.	Сравнить скорость чтения и записи 5 МБ символов при использовании классов буфиризированого и
не буфиризированого символьного ввода вывода.
 */

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "NewFile.txt");
        File file2 = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "NewFile2.txt");

        long start = System.nanoTime();

        //simpleWriter(file1, file2);
        bufferedWriter(file1, file2);

        long finish = System.nanoTime();
        System.out.println(finish - start);

    }

    public static void simpleWriter(File file1, File file2) {
        try (FileReader fr = new FileReader(file1);
             FileWriter fw = new FileWriter(file2, false)) {

            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static void bufferedWriter(File file1, File file2) {
        try (BufferedReader br = new BufferedReader(new FileReader(file1));
             BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {

            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

}
