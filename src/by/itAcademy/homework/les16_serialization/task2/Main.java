package by.itAcademy.homework.les16_serialization.task2;
/*
2.  Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
Десериализовать объект из того же файла, вывести значения полей в консоль.

3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями.
Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.

 */

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Computer
        Computer macbook = new Computer("Pro", "Intel", 8, 1450);
        File file = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "Java practice" + File.separator + "Serialization.txt");

        System.out.println(macbook);
        SerializationUtil.serialize(macbook, file);

        macbook = null;
        System.out.println(macbook);

        macbook = SerializationUtil.deserialize(file);
        System.out.println(macbook);

        // Notebook
        Notebook notebook = new Notebook("MacBook Pro", "Intel", 8, 1450, 1.4, 8.2, 13.4);
        File newFile = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "Java practice" + File.separator + "New_serialization.txt");

        System.out.println(notebook);
        SerializationUtil.serialize(notebook, newFile);

        notebook = null;
        System.out.println(notebook);

        notebook = (Notebook) SerializationUtil.deserialize(newFile);
        System.out.println(notebook); // weight = 0.0 так как transient
    }
}
