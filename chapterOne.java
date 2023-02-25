package com.example.shona;

public class chapterOne {

    public void optionsCell(){
        System.out.println("1. You investigate the commotion.");
        System.out.println("2. You stay in your cell, waiting in anticipation.");
        System.out.println("3. You call out to the guards and await a response");
    }

    public void prisonBreakDialogue(){
        System.out.println("You see a hooded figure approaching your cell.");
        System.out.println("Your eyes widen in surprise.");
        System.out.println("The figure looks at you solemnly.");
    }

    public void optionsCellRescue(){
        System.out.println("1. Aureon? What are you doing here?!");
        System.out.println("2. Now what an unexpected surprise. I don't suppose you're the one to execute me.");
        System.out.println("3. Sit in Silence.");
    }

    public void escapeCellDialogue(){
        System.out.println("You leave your cell and follow Aureon towards the hallway.");
        System.out.println("Aureon: We need to head towards the main gate of the city. The whole city is in uproar. King Artan is still conducting his purge throughout the Kingdom.");
        System.out.println("Aureon: I've managed to secure your gear, we can pick it up from the armory before we leave.");
        System.out.println("You head towards the armory, following Aureon's direction.");
    }

    public void escapeCellDialogueOptions(){
        System.out.println ("1. How many are dead in the city?");
        System.out.println ("2. You're risking a lot by saving me. Didn't you swear an oath to the king?");
        System.out.println ("3. This is all pretty sudden, why is the king doing this? You're in the royal guard Aureon, you must have some idea.");
        System.out.println ("4. Walk in Silence.");
    }

    public void armoryConfrontation(){
        System.out.println("You arrive at the armory and notice two guards standing at the front.");
        System.out.println("The guards shout and point their weapons at you.");
        System.out.println("The first guard shouts" + " It's the prisoner! Stop him.");
    }

    public void armoryCombatDialogue(){
        System.out.println("1. You charge the guards with Aureon.");
        System.out.println("2. You cautiously wait, anticipating the guards reactions and what they will do.");
        System.out.println("3. You wait for Aureon to do something.");
    }

    public void armoryDialogue(){
        System.out.println("You and Aureon approach the armory. The glare of the sunlight temporarily blinds you as you opened the door.");
        System.out.println("You look for your weapon and armour amongst the confiscated items.");
        System.out.println("You find your sword amongst the weapon racks in the armory and your armour neatly placed in a chest.");
        System.out.println("You fasten your armour, holster your sword and turn towards Aureon.");
        System.out.println("Aureon hands you a hooded cloak and you both make your way out of the prison.");
    }

    public void outsidePrisonDialogue(){
        System.out.println("You leave the prison with Aureon and enter the streets of Aethalsgard.");
        System.out.println("The streets are littered with possessions and belongings of the persecuted.");
        System.out.println("You hear distant screams and shouts ringing across the streets as the Royal Army continues it's purge.");
        System.out.println("You look at the carnage surrounding you and feel a sense of sadness.");
        System.out.println("Aureon looks over at you and gestures for you to follow him.");
        System.out.println("You follow Aureon through the streets of Aethalsgard, avoiding any patrols and guards.");
        System.out.println("You see a small child, crying outside the ruins of a small house.");
        System.out.println("There is blood splattered on the entrance of the house and you hear voices coming from within the house.");
    }

    public void houseConfrontation(){
        System.out.println("1. Ignore the child and continue onto the gate.");
        System.out.println("2. Approach the child and comfort them.");
        System.out.println("3. Enter the house and investigate the noise.");
    }

    public void postHouseConfrontation(){
        System.out.println("You pass through numerous homes that have been ransacked and see the remains of many Shona citizens that have been executed.");
        System.out.println("You cover your nose as the smell of burning flesh and blood hits you.");
        System.out.println("Aureon appears unfazed by the sight.");
        System.out.println("You and Aureon arrive at the main gates and see a blockade is currently in place.");
    }
}
