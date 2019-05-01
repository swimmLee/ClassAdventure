package decorator;

import java.util.Scanner;

public class Main {
    private Scanner kb;

    public static void main(String[] args) {
        new Main();
    }
    
    public Main(){
        kb = new Scanner(System.in);
        int menuChoice;
        
        Character basicCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Might: " + basicCharacter.getMight());
        
        System.out.println("\n");
        
        Character basicLee = new Spear(new Sword(new BasicCharacter("TidalWave")));
        System.out.println("Name: " + basicLee.getName());
        System.out.println("Might: " + basicLee.getMight());
        
        System.out.println("\n");
        
        String name = "BigWave";
        Character secondLee = new Spear(new Sword(
                new Shield(new Starving(new BasicCharacter(name)))));
        System.out.println("Name: " + secondLee.getName());
        System.out.println("Might: " + secondLee.getMight());
        
        Character warrior = null;
        
        
        printWarriorMenu();
        menuChoice = kb.nextInt();

        switch (menuChoice){
            case 1:
                kb.nextLine();
                System.out.println("type your warrior name.");
                name = kb.nextLine();
                warrior = new BasicCharacter(name);
                break;
            case 2:
                break;
        }
        
        while (menuChoice != 2)  {
            
            if(warrior != null){
                int toolChoice = 0;
                
                do {
                    printWarriorTools();
                    toolChoice = kb.nextInt();
                    
                    switch (toolChoice) {
                        case 1:
                            warrior = new Sword(warrior);
                            break;
                        case 2:
                            warrior = new Spear(warrior);
                            break;
                        case 3:
                            warrior = new Shield(warrior);
                            break;
                        case 4:
                            warrior = new Starving(warrior);
                            break;
                        case 5:
                            warrior = new Axe(warrior);
                            break;
                    }
                } while(toolChoice != 6);
            
                System.out.println("Name: " + warrior.getName());
                System.out.println("Might: " + warrior.getMight());
            }
            printWarriorMenu();
            menuChoice = kb.nextInt();
        }
    }
    
    private void printWarriorMenu(){
        System.out.println("1. Start new Game. ");
        System.out.println("2. Close this game. ");
        System.out.println(">>");
    }
    
    private void printWarriorTools(){
        System.out.println("1. Hacking Tool");
        System.out.println("2. Piercing Tool");
        System.out.println("3. Defensive Tool");
        System.out.println("4. Mystery Tool");
        System.out.println("5. Ultimate Tool");
        System.out.println("6. DONE ready for battle");
    }
}
