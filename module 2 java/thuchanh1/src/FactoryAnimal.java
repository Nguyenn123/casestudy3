public class FactoryAnimal {
    public Animal getAnimal(String type){
        if ("canine".equals(type)){
            return new Dog();
        }else if ("fat".equals(type)){
            return new Pig();
        }else {
            return new Cat();
        }
    }
}
