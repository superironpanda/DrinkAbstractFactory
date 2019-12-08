public class BottleFactory extends DrinkingAbstractFactory {
    @Override
    public Bottle getBottle(String Bottle) {
        if(Bottle == "water"){
            return new Water();
        }
        else if(Bottle == "vodka"){
            return new Vodka();
        }
        else{
            return null;
        }
    }

    @Override
    public Person getPerson(String personMood) {
        return null;
    }
}
