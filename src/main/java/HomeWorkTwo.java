public class HomeWorkTwo {
    public static void main(String[] args){
       System.out.println(twoNumbers(0,7));
        numbersOne(0);
        System.out.println(trueFalse(5));
        stringAndNumbers( "hello", 1);
        yearYears(2021);
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.

    public static boolean twoNumbers(int a, int b){    // сначала не смог проверить работу метода.
        int c = a + b;            // потом в main поместил метод в System.out.println и теперь выводится в консоль
        return (c>10 && c<=20);


    }

    //        2. Написать метод, которому в качестве параметра передается целое число,
    //        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //        Замечание: ноль считаем положительным числом.

    public  static int numbersOne(int a){
        if (a>=0){
            System.out.println("Положительное число");
            return a;
        }
        else {
            System.out.println("Отрицательное число");
            return a;
        }
    }

//        3. Написать метод, которому в качестве параметра передается целое число.
//        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean trueFalse(int a){   //не смог проверить работу метода - так же как и с 1 заданием
        return (a<0);
    }
    //        4. Написать метод, которому в качестве аргументов передается строка и число,
    //        метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void stringAndNumbers( String message, int a) {    // не понял как с числом быть?
        for(a = 0; a<5; a++ ){
            System.out.println(message);
        }
    }
    //        5. * Написать метод, который определяет, является ли год високосным,
    //        и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    //        кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean yearYears(int a){ // не смог довести до ума, чтобы и то и то работало. что то одно только
       // if(a%400==0 || a%4==0){
         //System.out.println("високосный - "+true);
        //} return true;
     //  if(a%100==0 || a>0){
       //     System.out.println("не високосный - "+false);
        //} return false;

        if  ((a%4==0 && a%100!=0) || a%400==0){     //спасибо
            System.out.println("високосный - "+true);
        }
        else   {
           System.out.println("не високосный - "+false);
        } return false;
    }
}
