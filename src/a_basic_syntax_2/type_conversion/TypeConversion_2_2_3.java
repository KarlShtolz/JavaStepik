package a_basic_syntax_2.type_conversion;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 * Sample Input 1:
 * 32
 * Sample Output 1:
 * |
 * Sample Input 2:
 * 29
 * Sample Output 2:
 * y
 */
public class TypeConversion_2_2_3 {
    public static char charExpression(int a) {
        return (char) ('\\'+a);
    }
}
