package com.demo.perfectNumber.checkingPerfectNumber;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PerfectNumberService {

    public boolean isPerfectNumber(int number){
        if (number == 1)
            return false;

        int sum = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number)
            return true;

        return false;
    }

    public ArrayList<Integer> findingPerfectNumbersInRange(String range) {

        String[] rangeArray = range.split("-");
        int starting_number = Integer.parseInt(rangeArray[0]);
        int ending_number = Integer.parseInt(rangeArray[1]);

        ArrayList<Integer> perfectNumberList = new ArrayList<>();

        for (int i = starting_number; i <= ending_number; i++) {
            if (isPerfectNumber(i)) {
                perfectNumberList.add(i);
            }
        }

        return perfectNumberList;
    }


}
