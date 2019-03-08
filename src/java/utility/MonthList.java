/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP PAVILION
 */
public class MonthList {
public static List<String> getMonths(){
		List<String> months = new ArrayList<>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
                                     months.add("July");
                                     months.add("August");
                                     months.add("September");
		months.add("October");
                                     months.add("November");
                                     months.add("December");
		return months;    
}
}