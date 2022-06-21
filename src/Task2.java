// Создать класс Calculator. У него должны быть методы:
//        Сумма
//        Деление
//        Умножение
//        Вычитание
//        Все методы должны быть перегружены и работать с тремя типами данных- double, long и int.

public class Task2 {
    public static void main(String[] args) {

        //1. Первая часть задания
        Calculator calculator=new Calculator();
        //Тип Double - деление
        System.out.println(calculator.division(5.0,2.0));
        //Тип int - сложение
        System.out.println(calculator.addition(5,2));
        //Тип long
        System.out.println(calculator.addition(5000L,2000L));
        //Тип long
        System.out.println(calculator.multiplication(5000L,2000L));
        //Тип int - вычитание
        System.out.println(calculator.subtraction(5000L,2000L));

        System.out.println("\n\n");
        //2. Вторая часть задания
        //Имеется класс Person, с 3 конструкторами
        System.out.println("Вторая часть задания:");

        //По-умолчанию
        Person person=new Person();
        person.getInfo();
        //С одним параметром
        Person person1=new Person("Alex");
        person1.getInfo();
        //С тремя параметрами
        Person person2=new Person("Alex",25,true);
        person2.getInfo();

    }
}
