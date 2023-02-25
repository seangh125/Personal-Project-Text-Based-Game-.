package com.example.shona;
import java.util.*;

public class Shona {

    private chapterOne c1;
    private chapterTwo c2;

    public Shona(){

        this.c1 = new chapterOne();
        this.c2 = new chapterTwo();

    }

    public static void main (String[] args){
        Shona storyStart = new Shona();
        storyStart.use();
    }

    public void use(){
        Scanner sc = new Scanner(System.in);
        int numericalCommand = 0;
        System.out.println("Chapter 1: The Escape.");
        System.out.println("Press Any Key to Begin");

        sc.nextLine();

        System.out.println("The year is 1479. The Kingdom of Thacia has begun a purge of all ethnic Shona within their kingdom. \n" +
                "The new king, Artan Surr has issued a decree, declaring that all non ethnic Thacians will be stripped of their rights and their liberties and all their possessions confiscated.\n" +
                "In the wake of this new decree, you have found yourself imprisoned after your families execution and the confiscation of your family's fortunes. \n" +
                "You awaken in a prison to the sound of a crash.");

        c1.optionsCell();

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
            c1.prisonBreakDialogue();
            break;
        }

        while (true) {

            c1.optionsCellRescue();
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
            c1.escapeCellDialogue();
            break;
        }

        //escapeCellDialogue put here.
        //escapeCellDialogue();
        //prompt to speak to Aureon (escapeCellDialogueOptions)

        while (true){
            c1.escapeCellDialogueOptions();
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
                    System.out.println("Aureon: We're almost there.");
            }

            //put armoryConfrontation here.
            c1.armoryConfrontation();
            break;
        }

        while (true){
            //start of the combat dialogue choices in front of armory.
            c1.armoryCombatDialogue();
            numericalCommand = sc.nextInt();
            switch (numericalCommand){
                case 1:
                    System.out.println("The guard charges you with his spear.");
                    System.out.println("You dodge his spear thrust and elbow him in the face.");
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
                    System.out.println("You: Well, I don't have a weapon.");
                    break;

                default:
                    System.out.println("You stand in shock, unable to move, as Aureon quickly dispatches the guards in front of you.");
                    System.out.println("Aureon: Not like you to freeze up like that.");
                    break;
            }

            c1.armoryDialogue();
            break;
        }

        while (true){
            c1.outsidePrisonDialogue();
            numericalCommand = sc.nextInt();
            switch(numericalCommand){
                case 1:
                    System.out.println("You ignore the cries of the child and continue on to the main gate.");
                    break;

                case 2:
                    System.out.println("You approach the child and offer your hand.");
                    System.out.println("The child appears frightened and cowers at your presence.");
                    System.out.println("The child continues to cry and flees at your presence.");
                    System.out.println("Aureon: There's nothing we can do for this child. We need to continue.");
                    break;

                case 3:
                    System.out.println("You approach the child and gesture to the house.");
                    System.out.println("The child looks at the entrance of the house and shakes his head before sobbing.");
                    System.out.println("You and Aureon enter the house and discover a grim sight.");
                    System.out.println("The house is in shambles, the families belongings have all been smashed and scattered on the floor.");
                    System.out.println("You delve deeper into the house and discover two bodies on the floor in front of a doorway.");
                    System.out.println("A man and a woman huddled together on the floor. It appears they were executed by the Royal Army.");
                    System.out.println("You remember the child suddenly and head outside to find them.");
                    System.out.println("The child is gone and you are left wondering whether there was anything more you could have done.");
                    break;

                case 4:
                    System.out.println("You do nothing and you continue to follow Aureon's lead.");
            }

            c1.postHouseConfrontation();

        }

    }

}
