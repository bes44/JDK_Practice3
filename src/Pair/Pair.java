package Pair;

/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары. Работу сдать в виде ссылки на гит репозиторий.
  */


public class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "one");
        System.out.println(pair);
    }
}
