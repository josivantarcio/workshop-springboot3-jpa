package com.datalifebrazil.course.entities;

import java.util.HashSet;
import java.util.Set;

public class Product {
	
	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imgUrl;
	
	private Set <Category> categories = new HashSet<>();
	
	
	

}
