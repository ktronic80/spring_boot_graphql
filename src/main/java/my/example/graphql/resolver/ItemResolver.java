package my.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import graphql.schema.DataFetcherFactoryEnvironment;
import graphql.schema.DataFetchingEnvironment;
import my.example.graphql.model.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemResolver implements GraphQLResolver<Item> {
    public List<Item> items(DataFetchingEnvironment environment) {
        Object o = environment.getSource();
        return Arrays.asList(new Item("i1", 980));
    }
}
