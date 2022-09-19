import java.util.Scanner;
public class Calculator_v3 {

    public static void main(String[] args) {
        CalculatorClass Ciklversion = new CalculatorClass();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String num = in.nextLine();
        num = num.replaceAll("\\s+",""); //удаляет пробелы из строки
        char [] charArraySr = num.toCharArray();//записывает в массив каждый символ
        String [] strings = num.split("[+-/*]");//метод разделяет строку [] - помещаются знаки выражения
        String firstel = strings[0];//для теста условия помещаем переменную первого значения выражения
        String Srtr = "";

        for(int i = 0; i < charArraySr.length;i++){
            Srtr = String.valueOf(charArraySr[i]);
            if(Srtr.equals("I")||Srtr.equals("V")||Srtr.equals("X")){
            }};

        if(Srtr.equals("I")||Srtr.equals("V")||Srtr.equals("X")){ //сравнивает значение из первого символа

            char [] charArray = num.toCharArray();//записывает каждый элемент в массив
            Rimnum vvod1 = Rimnum.valueOf(strings[0]);
            int rim1 = vvod1.getNumber();
            Rimnum vvod2 = Rimnum.valueOf(strings[1]);
            int rim2 = vvod2.getNumber();
            Ciklversion.cikl(rim1,rim2,charArray);
        }
        else {
            char[] charArray = num.toCharArray();//записывает каждый элемент в массив
            int num1 = 0;
            String stroka1 = String.valueOf(strings[0]);
            int num2 = 0;
            String stroka2 = String.valueOf(strings[1]);// и ниже преобразование string в int
            num1 = Integer.parseInt(stroka1);
            num2 = Integer.parseInt(stroka2);
            Ciklversion.cikl(num1,num2,charArray);}
        in.close();
    }}
class CalculatorClass{
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

        return three;
    }}
