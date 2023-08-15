package Task_1;

public class Cat {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void Greeting(){
        System.out.printf("Hi! My name is <%s> and i am <%d> years old! \n", name, age);
    }
}