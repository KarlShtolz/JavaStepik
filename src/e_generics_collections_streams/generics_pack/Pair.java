package e_generics_collections_streams.generics_pack;

/**
 * Generics 6_1_12
 * Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий
 * элементам принимать значение null.
 * Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of().
 * Конструктор должен быть закрытым (private).
 * С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:
 * @param <K>
 * @param <V>
 */
class Pair<K, V> {
    private K first;
    private V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static<K, V> Pair<K, V> of(K key, V value) {
        return new Pair<>(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
        return second != null ? second.equals(pair.second) : pair.second == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
