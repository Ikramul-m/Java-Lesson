class Friends {

    String name;
    static int numberFreinds;

    Friends(String name) {
        this.name = name;
        numberFreinds++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberFreinds + " friends.");
    }
}