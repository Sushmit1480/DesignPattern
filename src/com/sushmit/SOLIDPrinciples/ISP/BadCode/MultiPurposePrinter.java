package com.sushmit.SOLIDPrinciples.ISP.BadCode;

public class MultiPurposePrinter implements Machine{

	@Override
	public void print(Document doc) {
		System.out.println("Printing of the document is under process");
	}

	@Override
	public void scan(Document doc) {
		System.out.println("Scanning of the document is under process");
	}

	@Override
	public void copy(Document doc) {
		System.out.println("Copy of the document is under process");
	}

}
