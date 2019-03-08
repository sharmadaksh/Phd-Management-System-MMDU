/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author HP PAVILION
 */
import java.util.ArrayList;
import java.util.List;

public class DepartmentList {
public static List<String> getDepartment(){
		List<String> department = new ArrayList<>();
		department.add("Engineering");
		department.add("Management");
		department.add("Computer Applications");
		department.add("Hotel Management");
		department.add("Pharmacy");
		department.add("Nursing(Co-Education)");
                                     department.add("Nursing(For Girls)");
                                     department.add("Physiotherapy");
                                     department.add("Law");
		department.add("Dental Sciences");
                                     department.add("Medical Sciences");
                                     
		return department;    
}
}