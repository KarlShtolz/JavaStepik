package a_basic_syntax_2.control_structures;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же
 * порядке массив. Массивы могут быть любой длины, в том числе нулевой.
 * Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум
 * исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка
 * полученного массива при помощи Arrays.sort() уже не требовалась. К сожалению, автоматически это не проверить,
 * так что это остается на вашей совести :)
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит
 * проверяющая система.
 * Пример
 * Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
 */
public class ControlStructures_2_4_9 {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int len = a1.length+a2.length;
        int[] arr = new int[len];
        int i = 0;
        int count_a1 = 0;
        int count_a2 = 0;
        while(count_a1<a1.length || count_a2<a2.length){
            if(count_a1<a1.length && (count_a2 == a2.length || a1[count_a1]<a2[count_a2])){
                arr[count_a1+count_a2] = a1[count_a1];
                count_a1++;
            }else{
                arr[count_a1+count_a2] = a2[count_a2];
                count_a2++;
            }
        }
        return arr;
    }
    public static void print_arr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " - ");
        }
        System.out.println();
    }
}
