package com.sushmit.SOLIDPrinciples.ISP.BadCode;

public class SimplePrinter implements Machine{

	@Override
	public void print(Document doc) {
		System.out.println("Printing of the document is under process");
	}

	@Override
	public void scan(Document doc) {
		throw new UnsupportedOperationException("Scanning is not supported by this printer");
	}

	@Override
	public void copy(Document doc) {
		System.out.println("Copy of the document is under process");
	}

}
