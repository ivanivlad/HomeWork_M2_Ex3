package ex2;

public class Runner {
    public static void main(String[] args) {
        Garden<Apple> appleFarm = Apple::new;
        Garden<Apricot> apricotFarm = Apricot::new;

        Apple apple = appleFarm.grow();
        Apricot apricot = apricotFarm.grow();
    }
}
