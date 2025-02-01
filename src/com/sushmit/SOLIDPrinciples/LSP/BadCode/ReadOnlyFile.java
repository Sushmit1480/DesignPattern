package com.sushmit.SOLIDPrinciples.LSP.BadCode;

public class ReadOnlyFile extends File{
	public void write() {
		throw new UnsupportedOperationException("Can't write to readonly file");
	}
}
