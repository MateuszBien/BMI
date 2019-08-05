package com.company.CalculatorBMI.Controllers;
import com.company.CalculatorBMI.model.BmiCalculator;
import com.company.CalculatorBMI.model.Person;
import com.company.CalculatorBMI.repository.BmiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BmiController {
    @Autowired
    BmiRepository bmiRepository;
    @GetMapping("/")
    public String  home(ModelMap map){
        map.put("person",new Person());
        return "index";
    }
    @GetMapping("info")
    public String info(){

        return "info";
    }
    @PostMapping("/outcome")
    public String create(@ModelAttribute Person person, ModelMap map){
        BmiCalculator bmiCalculator=new BmiCalculator();
        bmiCalculator.calculator(person.getWeight(),person.getHight());
        System.out.println(bmiCalculator.getBmi());
        System.out.println(bmiCalculator.getBmi());

        person.setBmi(bmiCalculator.getBmi());
        person.setResult(bmiCalculator.getDescription());
        bmiRepository.save(person);
        map.put("person",person);

        return "/outcome";
    }











}
