package com.sushmit.SOLIDPrinciples.LSP.GoodCode;

public class WritableFile extends ReadableFile implements Writable{

	@Override
	public void write() {
		System.out.println("Writing in file");
	}
}
