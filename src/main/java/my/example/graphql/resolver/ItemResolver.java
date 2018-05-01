package my.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import graphql.schema.DataFetcherFactoryEnvironment;
import graphql.schema.DataFetchingEnvironment;
import my.example.graphql.model.Inventory;
import my.example.graphql.model.Item;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ItemResolver implements GraphQLResolver<Inventory> {
    public Item items(Inventory inventory) {
        return new Item("i1", 980);
    }
}
