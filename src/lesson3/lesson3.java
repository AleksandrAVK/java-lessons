package src.lesson3;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        //Пользовательский ввод
        Scanner in = new Scanner(System.in);
//        System.out.println("Введите целое число");
        int userNum = in.nextInt();
//        System.out.println(userNum * userNum);


        while (true) {
            System.out.println(" while Введите целое число" + "или ноль для выхода из программы");
            userNum = in.nextInt();
            if (userNum == 0) break; // завершает текущий цикл
            if (userNum >= 0) break; // завершает текущий цикл
            if (userNum < 0)
                continue; //переход на следующую итерацию.Тут останавливается и идёт  проверять while.Без выполнения кода ниже.
            System.out.println(userNum * userNum);
        }

        do {
            System.out.println(" doWhile : Введите целое число" + "или ноль для выхода из программы");
            userNum = in.nextInt();
            if (userNum < 0)
                continue; //переход на следующую итерацию.Тут останавливается и идёт  проверять while.Без выполнения кода ниже.
            System.out.println(userNum * userNum);
        } while (userNum != 0); //первую итерацию выполнит код в любом случае,а потом и во всех следующих будет проверять условия в while

    int start = 1, end = 12;
    // вывести все четные числа от start до end
        // четное число %2 == 0 это 2, 4,6,8,10,12

        while(start <= end) {
        if(start % 2 == 0 ) System.out.println(start);
        start = start + 1;
        }


        for(start = 1, end = 12; start <= end; start+=1){
            if(start % 2 == 0) System.out.println(start);
        }

// вывести все не отрицательные элементы последовательности от 90 и вниз с шагом 5

        for( int count= 90; count >= 0; count -= 5){
            System.out.println(count);
        }

        // вывести первые 10 элементов последовательности 2,4,6,8,10 .....


        for( int count = 0, num = 2; count <= 10; count += 1, num += 2){
            System.out.println(num);
        }


//  Задача на цикл while. Cчитать с консоли количество тарелок и моющего средства.Средство расходуется из расчёта 0.5 на 1 тарелку
//  в цикле выводить сколько осталось моющего средства после мытья каждой тарелки.
        // После цикла вывести сколько тарелок и моющего средства осталось
        long plates =1;
        double fairy =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество тарелок");
        plates = scanner.nextLong();
        System.out.println("Введите количество моющего средства");
        fairy = scanner.nextInt();
        while(plates > 0 && fairy > 0) {

            plates = plates -1 ;
            fairy = fairy - 0.5;
            System.out.println(plates);
            System.out.println(fairy);
        }
        System.out.println("Осталось тарелок" +"  "+ plates);
        System.out.println("Осталось моющего средства" +"  "+ fairy);

    }
}
