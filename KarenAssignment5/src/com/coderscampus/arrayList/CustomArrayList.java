package com.coderscampus.arrayList;


public class CustomArrayList<T> implements CustomList<T> {
	
	Object[] items = new Object[10];
	@Override
	public boolean add(T item) {
		int nextInt = 0;
		for (int i =0; i<items.length; i++) {
			if (items[i] ==null) {
				nextInt = i;
				break;
			}
			// check to see if array is full, if it is, double the array with "*2
			// then copy over everything to new array
			if(nextInt == items.length -1) {
				Object [] newItems = new Object[items.length * 2];
				for (int n = 0; n <items.length; n++) {
					newItems[n] = items[n];
				}
				//ensure all array item are carried over and check to see if they were actually added
				items = newItems;
			}
			items[nextInt]= item;
		}if (nextInt < items.length) {
			items[nextInt] = item;
			return true;
			
			//have sysout for if items were added correctly or not
		}
		System.out.println("added sucessfully");
		return false;
	}
	
	

	
	

//	@Override
//	public boolean add(T item) {
		

//
//		return false;
//	}

	@Override
	public int getSize() {

		return 0;
	}

	@Override
	public T get(int index) {

		return null;
	}

}
