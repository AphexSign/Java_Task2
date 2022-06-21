public class Person {
    public String name;
    public int age;
    public Boolean isActive;

    //Конструктор по умолчанию
    public Person(){}

    //Конструктор с одним параметром
    public Person(String name){
        this.name=name;
    }

    //Конструктор со всеми полями
    public Person(String name, int age, Boolean isActive){
        this.name=name;
        this.age=age;
        this.isActive=isActive;
    }

    public void getInfo(){
        System.out.println("Person {Name:"+this.name+" Age:"+this.age+" Activity: "+this.isActive+" }");
    }



}
