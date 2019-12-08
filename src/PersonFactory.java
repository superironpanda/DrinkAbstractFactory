public class PersonFactory extends DrinkingAbstractFactory {
    @Override
    public Person getPerson(String personMood) {
        if(personMood == "sad"){
            return new SadPerson();
        }
        else if(personMood == "healthy"){
            return new HealthyPerson();
        }
        else{
            return null;
        }
    }

    @Override
    public Bottle getBottle(String bottle) {
        return null;
    }
}
