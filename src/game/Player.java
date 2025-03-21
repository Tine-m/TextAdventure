package game;

import java.util.ArrayList;

class Player implements Observable {
    private String name;
    private int health;
    private ArrayList<Item> inventory;
    private ArrayList<Observer> observers;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void pickUpItem(Item item) {
        inventory.add(item);
        String message = "Player picked up: " + item.getName();
        System.out.println(message);
        notifyObservers(message);
    }

    public String getName() {
        return name;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}