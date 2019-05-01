package decorator;

public class Axe extends CharacterDecorator {
    
    public Axe(Character character){
        super(character);
    }
    
    @Override
    public String getName(){
        return character.getName() + ", Battle Axe Toting";
    }
    
    @Override
    public double getMight(){
        return character.getMight() + 10;
    }
}
