package my.example.graphql.model;


import java.util.List;

public class Inventory  {

    private String player;
    private int maxSpace;
    List<Item> items;

    public Inventory(String player, int maxSpace, List<Item> items) {
        this.player = player;
        this.maxSpace = maxSpace;
        this.items = items;
    }

    public String getPlayer() {
        return player;
    }

    public int getMaxSpace() {
        return maxSpace;
    }

    public List<Item> getItems() {
        return items;
    }
}
