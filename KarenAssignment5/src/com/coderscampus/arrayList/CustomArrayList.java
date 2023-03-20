package com.coderscampus.arrayList;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];

	@SuppressWarnings("unused")
	@Override
	public boolean add(T item) {
		System.out.println(item);
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				Object[] newItems = Arrays.copyOf(items, 20);
				for (int n = 0; n < newItems.length; n++);
			}
			if (items.equals(item))
				System.out.println("added succesfully");
			return true;
		} 
		return false;
	}
	@Override
	public int getSize() {
	System.out.println(size);
		return items.length;
	}
	int size = Array.getLength(items);

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}
}
