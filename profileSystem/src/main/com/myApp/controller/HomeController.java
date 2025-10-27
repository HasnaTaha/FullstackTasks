package main.com.myApp.controller;

import main.com.myApp.model.UserModel;
import main.com.myApp.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Controller
public class HomeController
{
    private ApplicationContext context;

    @Autowired
    private HomeService homeService;  // inject directly


    public void saveUser(UserModel user) {
        homeService.saveUser(user);
    }


    @RequestMapping("/")
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/formPage")
    public String formPage(@RequestParam("firstName") String firstName ,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("city") String city,
                           @RequestParam("birthdate") String birthdate,
                           @RequestParam("email") String email,
                           Model model)
    {
        LocalDate birthDateObj = LocalDate.parse(birthdate);

        saveUser(new UserModel("1",firstName,lastName,city,email,birthDateObj));
    return "ResultPage";
    }

}


