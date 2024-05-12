class Human {

    private int age = 11;
    private String name = "John";

    public Human() {
        age = 12;
        name = "John";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Construct {
    public static void main(String[] args) {

        Human obj = new Human();
        Human obj1 = new Human();

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
