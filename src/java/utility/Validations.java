/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    package utility;

public class Validations {
	public static boolean isEmpty(String value) {
		if (value != null) {
			return value.trim().isEmpty();
		}
		return false;
	}

	public static boolean isNumber(String value) {
		try {
			if (value != null) {
				Integer.parseInt(value.trim());
				return true;
			}
		} catch (NumberFormatException ex) {
		}
		return false;
	}

	public static boolean isFloat(String value) {
		try {
			if (value != null) {
				Float.parseFloat(value.trim());
				return true;
			}
		} catch (NumberFormatException ex) {
		}
		return false;
	}

	public static boolean isValidImage(String extension) {
		if (extension != null) {
			String extensions = "jpg,jpeg,png,bmp,gif";
                                                                System.out.println(""+extension+" " +extensions.indexOf(extension.toLowerCase()));
			return extensions.indexOf(extension.toLowerCase()) > -1;
		}
		return false;
	}
}

