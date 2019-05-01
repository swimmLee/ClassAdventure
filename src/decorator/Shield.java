package decorator;

public class Shield extends CharacterDecorator {
    
    public Shield(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return character.getName() + ", Shielded";
    }

    @Override
    public double getMight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return character.getMight() + 6;
    }
    
}
