package pl.edu.wszib.labjackson;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// json
//@JsonIgnoreProperties(ignoreUnknown = true)
public record Person(
        String firstName,
        String lastName,
        Address address,
        Integer age
) {
}
