package com.brk.designpatterns.behavioral.iterator;

import com.brk.designpatterns.behavioral.contract.BehavioralPattern;

public class IteratorPatternImpl implements BehavioralPattern {

	@Override
	public void apply() {
		BookRepository bookRepository = new BookRepository();

		bookRepository.addBook("Designing Data-Intensive Applications");
		bookRepository.addBook("Introduction to Algorithms, 3rd Edition");
		bookRepository.addBook("Effective Java");

		for (String bookName : bookRepository) {
			System.out.println(bookName);
		}

	}

	@Override
	public String getName() {
		return "Iterator Pattern";
	}

}
