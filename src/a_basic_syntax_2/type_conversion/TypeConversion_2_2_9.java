package a_basic_syntax_2.type_conversion;

/**
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 * Решать можно разными способами:
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * применив пару трюков из двоичной арифметики;
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * Sample Input 1:
 * 0
 * Sample Output 1:
 * false
 * Sample Input 2:
 * 1
 * Sample Output 2:
 * true
 * Sample Input 3:
 * -2
 * Sample Output 3:
 * true
 */
public class TypeConversion_2_2_9 {
    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        String bin_str = Integer.toBinaryString(value);
        long k = 0;
        for (int i = 0; i < bin_str.length(); i++)  if (bin_str.charAt(i) == '1') k++;
        if (k == 1)return true;
        else return false;
    }
}
