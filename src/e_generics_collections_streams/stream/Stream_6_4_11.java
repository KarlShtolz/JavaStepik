package e_generics_collections_streams.stream;

import java.util.stream.IntStream;

/**
 * Алгоритм, конечно, дурацкий и не выдерживающий никакой критики, но для практики работы со стримами сойдет :)
 * Пример
 * pseudoRandomStream(13) должен вернуть стрим, состоящий из следующих чисел:
 * 13, 16, 25, 62, 384, 745, 502, 200, 0, ... (дальше бесконечное количество нулей)
 */
public class Stream_6_4_11 {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000);
    }
}
