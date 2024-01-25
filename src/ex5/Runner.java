package ex5;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatRuler = Boat::getLength;
        Ruler<Animal> animalRuler = (animal) -> animal.getLength() + animal.getTailLength();

        System.out.println(boatRuler.takeLength(new Boat(10)));
        System.out.println(animalRuler.takeLength(new Animal(100, 5)));
    }
}
