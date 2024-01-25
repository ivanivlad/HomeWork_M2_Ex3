package ex3;

public class Runner {

    public static void main(String[] args) {
        Divination<String> daisy = (name) -> name.length() % 2 == 0;
        Divination<Human> fortuneTeller = (human) -> (human.getAge() + human.getHeight()) > 210;

        System.out.println(daisy.go("Вася"));
        System.out.println(daisy.go("Васян"));
        System.out.println(fortuneTeller.go(new Human(30, 200)));
    }
}
