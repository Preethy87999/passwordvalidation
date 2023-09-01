package com.simplilearn.TDDWorks;

public class PasswordValidator {
	
	public static boolean isValid(String password) {
		if(password.isEmpty()) {
		return false;
		}
		else {
			if(password.length()>=5 && password.length()<=10) {
				return true;	
			}
			else {
				return false;
			}
		}
	}

}
