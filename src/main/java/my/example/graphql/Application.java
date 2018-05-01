package my.example.graphql;

import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import my.example.graphql.resolver.ItemResolver;
import my.example.graphql.resolver.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

   // @Bean
    GraphQLSchema schema() {
        return GraphQLSchema.newSchema()
                .query(GraphQLObjectType.newObject()
                        .name("object")
                        .field(field -> field
                                .name("test")
                                .type(Scalars.GraphQLString)
                                .dataFetcher(environment -> "response")
                        )
                        .build())
                .build();
    }


    public Game query() {
        return new Game();
    }


    public ItemResolver itemResolver() {
        return new ItemResolver();
    }
}
