package main.com.myApp.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class UserDataModel {
    private String  name;
    private String  password;
    private String  country;
    private String  programmingLan;
    private List<String>  os = new ArrayList<>();



}
