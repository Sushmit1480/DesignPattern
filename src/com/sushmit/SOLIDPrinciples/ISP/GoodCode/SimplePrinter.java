package com.sushmit.SOLIDPrinciples.ISP.GoodCode;

import com.sushmit.SOLIDPrinciples.ISP.BadCode.Document;

public class SimplePrinter implements Printer{

	@Override
	public void print(Document doc) {
		System.out.println("printing the document");
	}

}
