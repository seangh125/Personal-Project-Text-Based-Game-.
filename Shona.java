package com.example.shona;
import java.util.*;

public class Shona {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int numericalCommand = 0;
        System.out.println("Chapter 1: The Escape.");
        System.out.println("Press Any Key to Begin");

        sc.nextLine();

        System.out.println("The year is 1479. The Kingdom of Thacia has begun a purge of all ethnic Shona within their kingdom. \n" +
                    "The new king, Artan Surr has issued a decree, declaring that all non ethnic Thacians will be stripped of their rights and their liberties and all their possessions confiscated.\n" +
                    "In the wake of this new decree, you have found yourself imprisoned after your families execution and the confiscation of your family's fortunes. \n" +
                    "You awaken in a prison to the sound of a crash.");

        optionsCell();

        while (true){

            //optionsCell();
            numericalCommand = sc.nextInt();
            switch (numericalCommand){
                case 1:
                    System.out.println("You see the cell guards rushing towards the entrance to the prison. You are alone in the cell.");
                    break;

                case 2:
                    System.out.println("The noise gets louder, you wonder what is happening and whether it is your turn for execution.");
                    break;

                case 3:
                    System.out.println("The guards ignore your call and leave your cell unattended");
                    break;

                default:
                    System.out.println("You do nothing and sit in silence");
                    break;

            }
            //prisonBreakDialogue put here.
            prisonBreakDialogue();
            break;
        }

        while (true) {

            optionsCellRescue();
            numericalCommand = sc.nextInt();
            switch (numericalCommand) {
                case 1:
                    System.out.println("Aureon: I don't have much time, the guards won't be distracted for long. We need to go.");
                    System.out.println("Aureon opens your cell door.");
                    break;

                case 2:
                    System.out.println("Aureon: Sure, I went through all the effort of creating a distraction, knocking out two guards."
                            + " Just to come here and end you myself.");
                    System.out.println("Aureon: No, I'm afraid I'm here to save you.");
                    System.out.println("Aureon opens your cell door.");
                    break;

                case 3:
                    System.out.println("Aureon: No, thank you? or I'm grateful for being rescued?");
                    System.out.println("Aureon opens your cell door.");
                    break;

                default:
                    System.out.println("Aureon opens your cell door.");
                    System.out.println("Aureon: Well are you just going to stand there and look at me.");
                    break;
            }
            
            //escapeCellDialogue();
            escapeCellDialogue();
            break;
        }
        
            //escapeCellDialogue put here.
            //escapeCellDialogue();
            //prompt to speak to Aureon (escapeCellDialogueOptions)
        
        while (true){
            escapeCellDialogueOptions();
            numericalCommand = sc.nextInt();
            switch(numericalCommand){

                case 1:
                    System.out.println("Aureon: I don't know to be honest. There's a lot of chaos right now, the guards are ransacking homes and executing people in the open. It's a... pretty grim sight.");
                    System.out.println("Aureon: For what its worth, I gave your parents a decent burial.");
                    System.out.println("You: Thank you Aureon, I was worried about what happened to their bodies.");
                    break;

                case 2:
                    System.out.println("Aureon: I swore an oath to protect the king and the royal family, it didn't say anything about rescuing friends.");
                    System.out.println("Aureon: I suppose I could always march you back to the cell and lock you up if you prefer.");
                    System.out.println("You: Smartass.");
                    break;

                case 3:
                    System.out.println("Aureon: I only have my suspicions, but I believe the king needs to rally the people of Thacia around a common enemy.");
                    System.out.println("Aureon: Unfortunately the Shona is that common enemy, and it probably doesn't help that majority of the Shona in Thacia are merchants or successful traders.");
                    System.out.println("You: There is no way the Shona Shogun will let this go, even if they are separate clans and fiefdoms, each clan will have lost a member to these purges.");
                    System.out.println("You: There will be a reckoning I am sure.");
                    System.out.println("Aureon: Lets hope it does not come to that.");
                    break;

                case 4:
                    System.out.println("Aureon: We're almost there.");
                    break;

                default:
                    return;
            }

            //put armoryConfrontation here.
            armoryConfrontation();
            break;
        }

        while (true){
            //start of the combat dialogue choices in front of armory.
            armoryCombatDialogue();
            numericalCommand = sc.nextInt();
            switch (numericalCommand){
                case 1:
                    System.out.println("The guard charges you with his spear.");
                    System.out.println("You dodge his spear thrust and elbow him in the face.");
                    System.out.println("The guard is stunned and you take the opportunity to elbow him in the face.");
                    System.out.println("The guard drops his spear and staggers to his feet.");
                    System.out.println("You pick up the spear and thrust it into his neck.");
                    System.out.println("The guard collapses in a puddle of blood.");
                    System.out.println("You look over and see Aureon knocking out the guard that attacked him.");
                    System.out.println("Aureon looks over at you disapprovingly.");
                    System.out.println("Aureon: You didn't need to kill him.");
                    break;

                case 2:
                    System.out.println("The guards cautiously approach you and Aureon.");
                    System.out.println("The guard orders you to surrender and return to your cell and motions for Aureon to drop his weapon and remove his hood.");
                    System.out.println("The guards inch closer to you and Aureon.");
                    System.out.println("Aureon parries the spear of the guard approaching him and headbutts the guard.");
                    System.out.println("The guard falls down and Aureon knocks him out with the hilt of his sword.");
                    System.out.println("You disarm the halberd of the approaching guard and knock him out with the hilt of the halberd.");
                    System.out.println("Aureon gestures for you to follow him into the armory.");
                    break;

                case 3:
                    System.out.println("Aureon approaches the two guards slowly.");
                    System.out.println("The guards gesture for Aureon to stop.");
                    System.out.println("Aureon charges the two guards and skillfully disarms them before knocking them both out with the hilt of his sword.");
                    System.out.println("Aureon: I really have to do everything today, don't I.");
                    System.out.println("Kira: Well, I don't have a weapon.");
                    break;

                default:
                    return;
            }

            chapterOneFinalDialogue();
            break;
        }

    }

    public static void optionsCell(){
        System.out.println("1. You investigate the commotion.");
        System.out.println("2. You stay in your cell, waiting in anticipation.");
        System.out.println("3. You call out to the guards and await a response");
    }

    public static void prisonBreakDialogue(){
        System.out.println("You see a hooded figure approaching your cell.");
        System.out.println("Your eyes widen in surprise.");
        System.out.println("The figure looks at you solemnly.");
    }

    public static void optionsCellRescue(){
        System.out.println("1. Aureon? What are you doing here?!");
        System.out.println("2. Now what an unexpected surprise. I don't suppose you're the one to execute me.");
        System.out.println("3. Sit in Silence.");
    }

    public static void escapeCellDialogue(){
        System.out.println("You leave your cell and follow Aureon towards the hallway.");
        System.out.println("Aureon: We need to head towards the main gate of the city. The whole city is in uproar. King Artan is still conducting his purge throughout the Kingdom.");
        System.out.println("Aureon: I've managed to secure your gear, we can pick it up from the armory before we leave.");
        System.out.println("You head towards the armory, following Aureon's direction.");
    }

    public static void escapeCellDialogueOptions(){
        System.out.println ("1. How many are dead in the city?");
        System.out.println ("2. You're risking a lot by saving me. Didn't you swear an oath to the king?");
        System.out.println ("3. This is all pretty sudden, why is the king doing this? You're in the royal guard Aureon, you must have some idea.");
        System.out.println ("4. Walk in Silence.");
    }

    public static void armoryConfrontation(){
        System.out.println("You arrive at the armory and notice two guards standing at the front.");
        System.out.println("The guards shout and point their weapons at you.");
        System.out.println("The first guard shouts" + " It's Kira! Stop him.");
    }

    public static void armoryCombatDialogue(){
        System.out.println("1. You charge the guards with Aureon.");
        System.out.println("2. You cautiously wait, anticipating the guards reactions and what they will do.");
        System.out.println("3. You wait for Aureon to do something.");
    }

    public static void chapterOneFinalDialogue(){
        System.out.println("You and Aureon approach the armory. The glare of the sunlight temporarily blinds you as you opened the door.");
        System.out.println("You look for your weapon and armour amongst the confiscated items.");
        System.out.println("You find your sword amongst the weapon racks in the armory and your armour neatly placed in a chest.");
        System.out.println("You fasten your armour, holster your sword and turn towards Aureon.");
        System.out.println("Aureon hands you a hooded cloak and you both make your way out of the prison.");
    }



}
