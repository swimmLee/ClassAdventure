package decorator;

public class Starving extends CharacterDecorator {
    
    public Starving(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Starving";
    }

    @Override
    public double getMight() {
        return character.getMight() + -12;
    }
    
}
