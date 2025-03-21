package game;
import java.util.ArrayList;

// Room class containing items
class Room {
    private String description;
    private ArrayList<Item> items;

    public Room(String description) {
        items = new ArrayList<>();
        this.description = description;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("The room is empty.");
        } else {
            System.out.println("Items in the " + description + ": ");
            for (Item item : items) {
                System.out.print(item.getName() + ", ");
            }

        }
    }

    public String getDescription() {
        return description;
    }
}
