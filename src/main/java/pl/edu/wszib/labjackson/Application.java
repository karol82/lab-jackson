package pl.edu.wszib.labjackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure((DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false))
        // serializacja
        Person person = new Person(
                "Paweł",
                "Pustelnik",
                new Address("Kraków", "00-000", "ul. Testowa", "1"),
                40
        );
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println(json);

        // deserializacja
        String exampleJson = """
                {
                  "firstName" : "Paweł",
                  "lastName" : "Pustelnik",
                  "address" : {
                      "city" : "Kraków",
                      "zipCode" : "00-000",
                      "street" : "ul. Testowa",
                      "number" : "1"
                    },
                    "age": 39
                    
                }
                """;
        Person deserializedPerson = objectMapper.readValue(exampleJson, Person.class);
        System.out.println("DeserializedPerson: " + deserializedPerson);

        // Zad: utwórz rekord Address, zawierający dane:
        // miasto
        // kod pocztowy
        // ulica
        // numer (String)
        // rozszerz klasę Person o adres i dostosuj powyższy przykład
        // rozszerz rekord Person o dodatkowe property "age"
    }
}
