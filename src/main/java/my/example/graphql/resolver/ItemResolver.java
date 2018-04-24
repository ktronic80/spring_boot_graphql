package my.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import my.example.graphql.model.Item;

import java.util.Collections;
import java.util.List;

public class ItemResolver implements GraphQLResolver<Item> {
    public List<Item> items(int level) {
        return Collections.emptyList();
    }
}
