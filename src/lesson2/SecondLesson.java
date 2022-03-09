package lesson2;

import org.w3c.dom.ls.LSOutput;

public class SecondLesson {
    public static void main(String[] args) {
// логические операторы &&
//        &&  вернёт true  если оба true, в остальных случаях  false
        int x = 50, y = 100, z = 191;
        boolean res = (x % 2 == 0) && (y % 2 == 0) && (z % 2 == 0);
//                    true && true && false
//                        true && false ;
//                        res = false
        System.out.println(res); //false
        boolean res1 = (x < y) && (y < z);
        System.out.println(res1); // true


        // || Оператор или


        //  вернет true  если один операнд true или оба true.  Если оба  false, тогда  false
        int code = 3333, age = 36;
        res = (code == 2222) || (code == 3333) || (code == 4444);
        // false || true || false
        //          true || false
        //          true
        System.out.println(res); // true

        res = (code != 3333) || (age < 18);
        System.out.println(res); //false
        int test = 10;
        System.out.println(test);

        // ! - оператор НЕ. Он меняет значение на противоположное
        System.out.println(!res);


        boolean isActive = false, isConnected = true;
        boolean res2 = !isActive || !isConnected; // true
        System.out.println(res2); // true

        res = !((code != 3333) || (age < 18));
//                false || false
//                        !false
//                          true
        System.out.println(res); // true

        int state = 1;

        if (state == 0) {
            System.out.println("closed App");
        } else if (state == 1) {
            System.out.println("open App");
        } else {
            System.out.println("Status Error");
        }

        int month = 9;
        if (month < 3 && month > 0 || month == 12) {
            System.out.println("Зима");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Весна");
        } else {
            System.out.println("Месяца с таким номером не существует");
        }

        month = 1;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяца с таким номером не существует");


        }

        int sum = 1000, saleCode = 7647;
// 4525 - вывести сумму с учетом скидки 30%
// 6424, 7012 - вывести сумму с учетом скидки 20%
// 7647, 9011, 6612 - вывести сумму с учетом скидки 10%
// в остальных случаях скидка не предусмотрена
        double result;
        switch (saleCode) {
            case 4525:
                result = sum - (sum * 0.3);
                break;
            case 6424:
            case 7012:
                result = sum - (sum * 0.2);
                break;
            case 7647:
            case 9011:
            case 6612:
                result = sum - (sum * 0.1);
                break;

            default:
               result = sum;


        }
        System.out.println(result);


    }


}

