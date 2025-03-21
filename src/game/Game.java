package game;

import observers.Log;
import observers.SoundManager;

public class Game {
    public void run() {
        // Create player and room
        Player player = new Player("Hero", 100);
        Room room = new Room("narrow cave");

        // Create game observers
        Observer log = new Log("game_log.txt");
        //TextUI textUIObserver = new TextUI();
        Observer soundManager = new SoundManager();
        // Attach observers to the player
        player.addObserver(log);
        //player.addObserver(textUIObserver);
        player.addObserver(soundManager);
        // Display updates in TextUI
        // textUIObserver.displayMessages();

        // Adding items to the room
        Item sword = new MeleeWeapon("Sword", 15);
        Item bow = new RangedWeapon("Bow", 12, 3);
        Item apple = new Food("Apple", 110);

        room.addItem(sword);
        room.addItem(bow);
        room.addItem(apple);

        // Game simulation
        //Player enters room
        System.out.println(player.getName() + " enters " + room.getDescription());
        player.notifyObservers("Entering " + room.getDescription());
        try {
            Thread.sleep(4000); // simulate elapsed time
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        room.showItems();
        System.out.println();
        System.out.println("\u001B[31;1mGet ready for adventures⚠️\u001B[0m");


        player.pickUpItem(sword);
        try {
            Thread.sleep(5000); // simulate elapsed time
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        player.pickUpItem(apple);
        try {
            Thread.sleep(3500); // simulate elapsed time
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        player.pickUpItem(bow);
        try {
            Thread.sleep(2500); // simulate elapsed time
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
