package by.itAcademy.homework.les09_generics.task1;
/*
1.	Создать класс Pair, параметризованный двумя параметрами K и V.
Класс должен хранить две переменные типов K и V соответственно.
У класса должен быть конструктор, принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.
 */

public class Pair<K, V> {
    private K variable1;
    private V variable2;

    public Pair(K variable1, V variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public K getVariable1() {
        return variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public void setVariable1(K variable1) {
        this.variable1 = variable1;
    }

    public void setVariable2(V variable2) {
        this.variable2 = variable2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "variable1=" + variable1 +
                ", variable2=" + variable2 +
                '}';
    }
}
