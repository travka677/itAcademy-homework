package by.itAcademy.homework.les09.task2;
/*
2.	Создать статический обобщённый метод swap в final классе PairUtil.
Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.
 */
import by.itAcademy.homework.les09.task1.Pair;

public final class PairUtil {
    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getVariable2(), pair.getVariable1());
    }
}
