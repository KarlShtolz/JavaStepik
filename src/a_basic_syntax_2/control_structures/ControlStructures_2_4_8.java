package a_basic_syntax_2.control_structures;

import java.math.BigInteger;

/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 * Факториал
 * N вычисляется как
 * 1⋅2⋅...⋅N.
 * Поскольку это очень быстро растущая функция, то даже для небольших
 * N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * Sample Input 1:
 * 1
 * Sample Output 1:
 * 1
 * Sample Input 2:
 * 3
 * Sample Output 2:
 * 6
 */
public class ControlStructures_2_4_8 {
    public static BigInteger factorial(int value) {
        BigInteger big = BigInteger.ONE;
        for(int i=1; i<=value; i++){
            big=big.multiply(BigInteger.valueOf(i));
        }
        return big;
    }
}
