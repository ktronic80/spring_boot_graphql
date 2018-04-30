package my.example.graphql.model;


public class Inventory  {

    private String player;
    private int maxSpace;


    public Inventory(String player, int maxSpace) {
        this.player = player;
        this.maxSpace = maxSpace;
    }

    public String getPlayer() {
        return player;
    }

    public int getMaxSpace() {
        return maxSpace;
    }


}
