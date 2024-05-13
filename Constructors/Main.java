
public class Main {
    public static void main(String[] args) {

        Human human = new Human("Rick", 65, 78);
        Human human1 = new Human("Ikramul", 24, 80);

        System.out.println("Name: " + human.name);
        System.out.println("Age: " + human.age);
        System.out.println("Weight: " + human.weight + " kg");

        System.out.println();
        System.out.println();

        System.out.println("Name: " + human1.name);
        System.out.println("Age: " + human1.age);
        System.out.println("Weight: " + human1.weight);

    }
}