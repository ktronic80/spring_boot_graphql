package my.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import my.example.graphql.model.Inventory;
import my.example.graphql.model.Item;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Game implements GraphQLQueryResolver {


    public List<Item> itemsForPlayer(String playerName) {
        return Collections.emptyList();
    }

   public Inventory inventory(String player) {
        return new Inventory("xxx", 10);
    }


}
