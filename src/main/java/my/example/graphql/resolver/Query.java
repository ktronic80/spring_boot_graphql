package my.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import my.example.graphql.model.Inventory;
import my.example.graphql.model.Item;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;


public class Query implements GraphQLQueryResolver {


    public List<Item> itemsForPlayer(String playerName) {
        return Collections.emptyList();
    }

    public Inventory inventory(String player) {
        return null;
    }

    public List<Item> items(int level) {
        return Collections.emptyList();
    }
}
