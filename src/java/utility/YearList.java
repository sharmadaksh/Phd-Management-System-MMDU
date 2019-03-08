/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author HP PAVILION
 */
public class YearList {
    public static List<String> getYear(){
		List<String> years_tmp = new ArrayList<String>();
for(int years = 2010; years<=Calendar.getInstance().get(Calendar.YEAR); years++) {
    years_tmp.add(years+"");
}
		return years_tmp;    
}
}
