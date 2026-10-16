package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.DaycareCenter;

public interface DaycareCenterService {

	DaycareCenter add(DaycareCenter ds);
	
	List<DaycareCenter> displayAll();
	
	String deleteById(long id);
}
