package com.project.paymentt.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.paymentt.service.BlocklistService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class BlocklistRestController {
	@Autowired
	private BlocklistService blocklistService;
	@GetMapping("/blocklist/{name}")
	public String searchInBlocklist(@PathVariable String name) throws FileNotFoundException {
		String check;
		if(blocklistService.findNameInBlocklist(name)==true) {
			System.out.println("name found in blocklist");
			check = "yes";
			return check;
		}
		else {
			System.out.println("name is not found");
			check = "no";
			return check;
		}
	}
}
