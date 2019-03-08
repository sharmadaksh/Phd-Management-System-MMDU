/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HP PAVILION
 */
public class Roles {
    public static List<String> getRoles(){
		List<String> roles = new ArrayList<>();
		roles.add("Admin");
		roles.add("Supervisor");
		roles.add("Scholar");
		roles.add("Principal");
		roles.add("Dean");
		roles.add("HOD");
                                     roles.add("DRA");
                                     roles.add("PHD Co-ordinator");
		return roles;
}
    
}
