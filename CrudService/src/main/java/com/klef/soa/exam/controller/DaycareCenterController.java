package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.DaycareCenter;
import com.klef.soa.exam.service.DaycareCenterService;

@RestController
@RequestMapping("/daycare")
public class DaycareCenterController {

	@Autowired
	private DaycareCenterService service;
	
	@GetMapping("/")
	public String test() {
		return "Test API Call";
	}
	
	@PostMapping("/add")
	public ResponseEntity<DaycareCenter> add(@RequestBody DaycareCenter ds){
		
		DaycareCenter dss = service.add(ds);
		return ResponseEntity.status(201).body(dss);
		
	}
	
	@GetMapping("/displayall")
	public ResponseEntity<List<DaycareCenter>> displayAll(){
		List<DaycareCenter> dss = service.displayAll();
		return ResponseEntity.ok(dss);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable long id){
		String msg = service.deleteById(id);
		return ResponseEntity.ok(msg);
	}
}
