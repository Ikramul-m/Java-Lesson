public class Main {
    public static void main(String[] args) {

        Food food1 = new Food("Pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] refg = { food1, food2, food3 };

        System.out.println(refg[0].name + " " + refg[1].name + " " + refg[2].name);

    }
}