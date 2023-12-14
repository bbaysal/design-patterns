package com.brk.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class BookRepository implements Iterable<String> {

	private String[] bookList;
	int index;

	public BookRepository() {
		bookList = new String[10];
		index = 0;
	}

	public void addBook(String bookName) {
		if (index == bookList.length) {
			String[] longerBookList = new String[index + 5];
			System.arraycopy(bookList, 0, longerBookList, 0, index);
			bookList = longerBookList;
			longerBookList = null;
		}
		bookList[index] = bookName;
		index++;
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> it = new Iterator<String>() {
			private int currentIndex = 0;

			@Override
			public String next() {
				return bookList[currentIndex++];
			}
			

			@Override
			public boolean hasNext() {
				return currentIndex == bookList.length && bookList[currentIndex] != null;
			}
		};

		return it;
	}

}
