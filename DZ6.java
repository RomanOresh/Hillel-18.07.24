import java.util.Arrays;
import java.util.Random;

public class DZ6 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[20];

//        for (int i : numbers) {
//            numbers[i] = rand.nextInt(-100,100);   // Пока не до конца разобрался с foreach
//        }

        for (int i = 0; i < 20; i++){
        numbers[i] = rand.nextInt(-100,100); // Заполнение массива рандомными числами от -100 до 100.
        }


        int parniChisla = 0;
        int neparniChisla = 0;

        int minimalElement = numbers[0];
        int maximalElement = numbers[0];
        int minimalElementIndex = 0;
        int maximalElementIndex = 0;

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0) {                 // Подсчёт всех отрицательных чисел массива.
                sum += numbers[i];
            }


            if (numbers[i]%2 == 0){               // Подсчёт количества парных и непарных чисел массива.
                parniChisla++;
            }else{
                neparniChisla++;
            }


            if(numbers[i] < minimalElement){      // Вычисление минимального элемента и его индекса.
                minimalElement = numbers[i];
                minimalElementIndex = i;
            }
            if(numbers[i] > maximalElement){      // Вычисление максимального элемента и его индекса.
                maximalElement = numbers[i];
                maximalElementIndex = i;
            }
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < numbers.length; i++) {     // Нахождение первого отрицательного числа.
            if (numbers[i] < 0) {
                a = i;
                break;
            }
        }

        for (int i = a+1; i < numbers.length ; i++) {  // Подсчёт суммы после первого отрицательного числа.
            b += numbers[i];
        }
        double arifmet = (double) b / (numbers.length - a - 1);  // Подсчёт среднего арифметического после первого отрицательного числа


        System.out.println("Элеметы массива: " + Arrays.toString(numbers));     // Вывод на консоль
        System.out.println("Сумма отрицательных чисел: " + sum);
        System.out.println("Количество парных чисел: " + parniChisla);
        System.out.println("Количество непарных чисел: " + neparniChisla);
        System.out.println("Наименьший элемент: " + minimalElement + " Его индекс: " + minimalElementIndex);
        System.out.println("Наибольший элемент: " + maximalElement + " Его индекс: " + maximalElementIndex);
        System.out.printf("Среднее арифметическое чисел после первого отрицательного числа: " + "%.2f", arifmet );



    }
}
