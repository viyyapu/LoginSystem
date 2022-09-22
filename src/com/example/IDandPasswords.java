package com.example;

import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		logininfo.put("Hey","hisaisree");
		logininfo.put("sirisha","PASSWORDS");
		logininfo.put("Heyhello","omsai");
		
	}
	
	
	protected HashMap getLoginInfo(){
		return LoginInfo();
		
	}

	public HashMap<String, String> LoginInfo() {
		return logininfo;
		
		
	}

	
}
