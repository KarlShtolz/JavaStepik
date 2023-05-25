package c_exception_4.introducing_to_exception;

/**
 * Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(), это метод при передаче
 * отрицательного параметра должен бросать исключение java.lang.IllegalArgumentException с сообщением "Expected
 * non-negative number, got ?", где вместо вопросика будет подставлено фактически переданное в метод число.
 */
public class IntroductionToExceptions_4_1_9 {
    public static double sqrt(double x) {
        if (x < 0){
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }
}
