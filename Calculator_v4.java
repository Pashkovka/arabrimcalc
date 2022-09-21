import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Scanner;

public class Calculator_v4 {


    public static void main(String[] args) throws IOException {
        System.out.print("Введите пример: ");
        Scanner in = new Scanner(System.in);
        System.out.println(calc(in.nextLine()));
    }

    public static String calc(String input){
        String example = input;
        CalculatorClass2 Ciklversion = new CalculatorClass2();
        //String num = in.nextLine();
        example = example.replaceAll("\\s+",""); //удаляет пробелы из строки
        char [] charArraySr = example.toCharArray();//записывает в массив каждый символ
        String [] strings = example.split("[+-/*]");//метод разделяет строку [] - помещаются знаки выражения
        //       String firstel = strings[0];//для теста условия помещаем переменную первого значения выражения
        //       System.out.println(String.valueOf(strings.length));
        int bolshe = strings.length;
//
//        boolean a = true;
//        boolean b = true;
//        if(strings[0].contains("I")||strings[0].contains("V")||strings[0].contains("X")){
//            a = true;
//        };
//        if (!(strings[1].contains("V"))||!(strings[1].contains("I"))||!(strings[1].contains("X"))){
//            b = true;
//        };
//
//        if (a&&b){
//
//            try {
//                throw new IOException(); // другой метод
//            } catch (IOException e) {
//                System.out.println("throws Exception //т.к. строка не является математической операцией");
//                System.exit(0);
//            }
//
//        };
        //
//       String strokamassiva1 = String.valueOf(strings[0]);// и ниже преобразование string в int
//        System.out.println(strokamassiva1);
//        int firstnum = Integer.parseInt(strokamassiva1);
//        String strokamassiva2 = String.valueOf(strings[0]);// и ниже преобразование string в int
//        int doublenum = Integer.parseInt(strokamassiva1);
//
//        if (firstnum>10){
//            System.out.println("Число 1 больше 10");
//        }
//
//        if (doublenum>10){
//            System.out.println("Число 2 больше 10");
//        }

        if(bolshe>2){
            try {
                throw new IOException(); // другой метод
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                System.exit(0);
            }};
        if(bolshe==1){
            try {
                throw new IOException(); // другой метод
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. строка не является математической операцией");
                System.exit(0);
            }};
        String Srtr = "";


        for(int i = 0; i < charArraySr.length;i++){
            Srtr = String.valueOf(charArraySr[i]);

            if(Srtr.equals("I")||Srtr.equals("V")||Srtr.equals("X")){
            }};

        if(Srtr.equals("I")||Srtr.equals("V")||Srtr.equals("X")){ //сравнивает значение из первого символа
//            System.out.println("Дошли до цикла");
            char [] charArray = example.toCharArray();//записывает каждый элемент в массив
            Rimnum vvod1 = Rimnum.valueOf(strings[0]);
            int rim1 = vvod1.getNumber();
            Rimnum vvod2 = Rimnum.valueOf(strings[1]);
            int rim2 = vvod2.getNumber();
    //        Ciklversion.cikl(rim1,rim2,charArray);
         //   String stroka1 = String.valueOf(strings[0]);
         //   String stroka2 = String.valueOf(strings[1]);// и ниже преобразование string в int
        //    rim1 = Integer.parseInt(stroka1);
         //   rim2 = Integer.parseInt(stroka2);
            int num3 = 0;
            //делаем из цикла метод, в который добавляем переменные полученные либо после римских цифр, либо арабских
            //добавить классы для Римских и Арабских

            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == '+') {
                    num3 = rim1 + rim2;
                } else if (charArray[i] == '-') {
                    num3 = rim1 - rim2;
                } else if (charArray[i] == '*') {
                    num3 = rim1 * rim2;
                } else if (charArray[i] == '/') {
                    num3 = rim1 / rim2;
                } else {
                }
                ;
            }
            Math.round(num3);
if(num3 == 0||num3 < 0){

    try {
        throw new IOException(); // другой метод
    } catch (IOException e) {
        System.out.println("throws Exception // Ответ равен нулю или отрицательный");
        System.exit(0);
    }

}
            String [] Rimmassiv = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI"};//создаем массив с данными
            System.out.println("Ответ римский: "+Rimmassiv[num3-1]);
//            for (int i=0; i<=num3; i++){
//                System.out.println(Rimmassiv[i]);
//            }

//            System.out.println("Ответ римский: "+num3);

        }
        else {
            char[] charArray = example.toCharArray();//записывает каждый элемент в массив
            int num1 = 0;
            String stroka1 = String.valueOf(strings[0]);
//            System.out.println("Как выглядит первое число: "+stroka1);
            int num2 = 0;
            String stroka2 = String.valueOf(strings[1]);// и ниже преобразование string в int
            num1 = Integer.parseInt(stroka1);
            num2 = Integer.parseInt(stroka2);

            if (num1>10||num2>10){
                try {
                    throw new IOException(); // другой метод
                } catch (IOException e) {
                    System.out.println("throws Exception // Одно или оба значения больше 10");
                    System.exit(0);
                }
            }

            Ciklversion.cikl(num1,num2,charArray);}
        //example.close();
        // return String;
        return example = "";//сделно для того чтобы что-то вернуть
    }}
class CalculatorClass2{
    int one;
    int two;
    int three;
    char [] charArray2;
    int cikl(int pervoe, int vtoroe, char [] massiv){
        charArray2 = massiv;
        one = pervoe;
        two = vtoroe;
        for (int i = 0; i < charArray2.length; i++) {
            if (charArray2[i] == '+') {three = one + two;}
            else if (charArray2[i] == '-') {three = one - two;}
            else if (charArray2[i] == '*') {three = one * two;}
            else if (charArray2[i] == '/') {three = one / two;}
            else {};} System.out.println("Ответ: "+three);

        return Math.round(three);
    }}

