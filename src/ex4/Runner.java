package ex4;

public class Runner {
    public static void main(String[] args) {
        Burning<Uraniam> nuclearReactor = (o) -> System.out.println("зеленый свет вокруг!");
        Burning<Wood> fire = (o) -> System.out.println("желто-красный свет вокруг!");

        nuclearReactor.burn(new Uraniam());
        fire.burn(new Wood());
    }
}
