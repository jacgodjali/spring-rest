package com.second;

import java.util.AbstractMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/employees/{empId}/score", method = RequestMethod.GET)
    AbstractMap.SimpleEntry<String, Double> getEmployeeByFilter(@PathVariable long empId) {
        double result = Math.random()*100;
        return new AbstractMap.SimpleEntry<String, Double>("score", result);
    }
}