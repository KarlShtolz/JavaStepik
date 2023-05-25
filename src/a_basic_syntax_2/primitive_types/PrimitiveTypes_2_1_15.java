package a_basic_syntax_2.primitive_types;

/**
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное. Данная задача актуальна, например, при работе с битовыми полями.
 * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * Sample Input:
 * 0 1
 * Sample Output:
 * 1
 */
public class PrimitiveTypes_2_1_15 {
    public static int flipBit(int value, int bitIndex) {
        return(value ^ ((int)Math.pow(2, (bitIndex-1)))); // put your implementation here
    }
}
