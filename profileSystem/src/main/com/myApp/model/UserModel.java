package main.com.myApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private LocalDate birthDate;
}
