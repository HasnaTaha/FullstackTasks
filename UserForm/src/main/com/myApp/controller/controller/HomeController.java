package main.com.myApp.controller.controller;

import main.com.myApp.controller.model.UserDataModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.Period;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("userDataModel", new UserDataModel());
        return "formPage";
    }

    @RequestMapping("/userForm")
    public String userForm(@ModelAttribute("userDataModel")UserDataModel userDataModel, Model model) {



        return "ageResultPage";
    }

}


