public class Producer {
    public static DrinkingAbstractFactory get(String choice){
        if(choice == "person"){
            return new PersonFactory();
        }
        else if(choice == "bottle"){
            return new BottleFactory();
        }
        else {
            return null;
        }
    }
}
