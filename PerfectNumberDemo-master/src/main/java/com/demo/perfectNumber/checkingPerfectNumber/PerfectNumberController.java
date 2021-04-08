package com.demo.perfectNumber.checkingPerfectNumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PerfectNumberController {

    @Autowired
    private PerfectNumberService perfectNumberService;

    @GetMapping("/checkPerfectNumber/{number}")
    public boolean getPerfectNumber(@PathVariable("number") int number) {

        return perfectNumberService.isPerfectNumber(number);
    }

    @GetMapping("/checkPerfectNumberInRange/{range}")
    public ArrayList<Integer> getPerfectNumberRange(@PathVariable("range") String range) {

        return perfectNumberService.findingPerfectNumbersInRange(range);
    }

}
