package com.webcalc.action;

import com.webcalc.service.CalculatorService;

public class CalculatorAction  {

    public String execute() {
    	CalculatorService calculatorService = new CalculatorService();
		String calculatorPage = calculatorService.getCalculatorWebsite();
		System.out.println(calculatorPage);
        return calculatorPage;
    }

}
