package com.company.CalculatorBMI.Controllers;
import com.company.CalculatorBMI.repository.BmiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableControler {

@Autowired
  private   BmiRepository bmiRepository;


    @GetMapping("/table")
    public String showTable(ModelMap map){
        map.put("persons",bmiRepository.findAll());
        return "table";
    }

}
