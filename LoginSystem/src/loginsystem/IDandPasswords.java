/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
	    logininfo.put("Ali","123");
	    logininfo.put("Ayse","PASSWORD");
	    logininfo.put("Osman","abc123");
	}
	
	public HashMap getLoginInfo(){
	    return logininfo;
	}
}

