package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Period;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/ageForm")
    public String ageForm(@RequestParam("year") String year , @RequestParam("month") String month,@RequestParam("day") String day, Model model)
    {

        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        LocalDate birthDate = LocalDate.of(y, m, d);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        String result =  age.getYears() + " years,"
                + age.getMonths() + " months, and "
                + age.getDays() + " days.";

        //step2: add name to model
        model.addAttribute("result" , result);


        //step3: return view page
        return "ageResultPage";
    }

}


