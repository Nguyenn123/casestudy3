public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();

        Animal a1 = factoryAnimal.getAnimal("feline");
        System.out.println("a1 keu: "+ a1.makeSound());

        Animal a2 = factoryAnimal.getAnimal("canine");
        System.out.println("a2 keu: "+ a2.makeSound());
    }
}
