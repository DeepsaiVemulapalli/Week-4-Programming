package com.info.client;

import com.info.collection.CollectionImpl;
import com.info.iterator.Iterator;

public class CookingEquipments {
	
	
	public static void main(String[] args) {
		
		//Iterator pattern to show cooking utils
		System.out.println("*****Iterator pattern to show cooking utils in kitchen******");
		CollectionImpl collectionImpl = new CollectionImpl();

		Iterator iterator = collectionImpl.getIterator();

		while (iterator.hasNext()) {
			Object object = iterator.next();
			String name = (String) object;
			System.out.println(name);

		}
		
	}

}
