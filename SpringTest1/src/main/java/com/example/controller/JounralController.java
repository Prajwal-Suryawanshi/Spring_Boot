package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.JounralEntry;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/jounral")
public class JounralController {

	private Map<Long, JounralEntry> je=new HashMap<>();
	
	@GetMapping
	public List<JounralEntry> getAll(){
		return new ArrayList<>(je.values());
	}
	
	@PostMapping
	public boolean createEntry(@RequestBody JounralEntry entryimp){
		je.put(entryimp.getId(), entryimp);
		return true;
	}
	
	@GetMapping("id/{myid}")
	public JounralEntry getId(@PathVariable Long myid) {
		return je.get(myid);
	}
	
	@DeleteMapping("id/{myid}")
	public JounralEntry deletedata(@PathVariable Long myid) {
		return je.remove(myid);
	}
}

