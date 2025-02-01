package com.sushmit.SOLIDPrinciples.ISP.GoodCode;

import com.sushmit.SOLIDPrinciples.ISP.BadCode.Document;

public class MultiPurposePrinter implements Printer, Copier, Scanner{

	@Override
	public void scan(Document doc) {
		System.out.println("scanning the document");
	}

	@Override
	public void copy(Document doc) {
		System.out.println("copying the document");
	}

	@Override
	public void print(Document doc) {
		System.out.println("printing the document");
	}

}
