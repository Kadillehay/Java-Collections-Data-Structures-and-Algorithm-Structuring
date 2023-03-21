package com.coderscampus.arrayList;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];
	int size = 0;
	int b = 0;

	@Override
	public boolean add(T item) {
		items[b] = item;
		b++;
		if (item == null )
			return false;
		System.out.println( item + " :added sucessfully");

		Object[] newItems = Arrays.copyOf(items, items.length * 2);
		items = newItems;

		return true;
	}

	@Override
	public int getSize() {
		int count = 0;

		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				count++;
			}
		}
		return count;
	}


	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {

		return (T) items[index];

	}
}
