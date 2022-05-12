package com;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Consumer;


public class Lamda {
	
		public static void main(String[] args) {
			
		

			
					
					List<Product> list=new ArrayList<>();
					list.add(new Product(1,"book",25));
					list.add(new Product(2,"pen",5));
					list.add(new Product(3,"mobile",40000));
					
					
					System.out.println("sort on the basis of name..");
					
					Collections.sort(list,(p1,p2)->{
						return p1.name.compareTo(p2.name);
					});
					for(Product p:list) {
						System.out.println(p.id+" "+p.name+" "+p.price);
					}
				}
				

			}
			class Product{
				int id;
				String name;
				int price;
				public Product(int id,String name,int Price) {
					
					this.id=id;
					this.name=name;
					this.price=Price;	
				}
			

			
		}
	


