package com.project.paymentt.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class BlocklistService {

	public boolean findNameInBlocklist(String name) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Administrator\\Downloads\\sdnlist.txt");
		Scanner sc = new Scanner(file);
		String names = name.toLowerCase();
		boolean check = false;
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			String st = s.toLowerCase();
			if(st.contains(names)) {
				System.out.println("found");
				check = true;
				return check;
			}
		}
		if(check==false) System.out.println("not found");
		sc.close();
		return check;
	}
}
