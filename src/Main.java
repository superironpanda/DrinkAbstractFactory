public class Main {
    public static void main(String[] args){
        DrinkingAbstractFactory personType = Producer.get("person");
        DrinkingAbstractFactory bottleType = Producer.get("bottle");

        Person person = personType.getPerson("sad");
        Bottle bottle = bottleType.getBottle("vodka");

        person.drink();
        bottle.getDrink();

    }
}
