package com.greatlearning.main;

import java.util.*;

import com.greatlearning.service.Balancing;

public class driver {

	public static void main(String[] args) {
		System.out.println("enter the paranthesis");
		Scanner sc=new Scanner(System.in);
		String brack=sc.nextLine();
		Balancing ob=new Balancing();
		Balancing.balancebracket(brack);
		if(ob.balancebracket(brack))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		

	}

}
