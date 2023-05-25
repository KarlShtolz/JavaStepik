package c_exception_4.introducing_to_exception;

/**
 * Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
 * Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный
 * утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
 * является точкой входа в программу, т.е. его никто не вызывал.
 * Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод,
 * откуда сообщение было залогировано.
 */
public class IntroductionToExceptions_4_1_10 {
    public static String getCallerClassAndMethodName() {
        if (Thread.currentThread().getStackTrace().length > 3) {
            return (Thread.currentThread().getStackTrace()[3].getClassName() + "#" +
                    Thread.currentThread().getStackTrace()[3].getMethodName());
        }
        return null;
    }
}
