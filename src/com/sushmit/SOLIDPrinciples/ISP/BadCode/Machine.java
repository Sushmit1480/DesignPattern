package com.sushmit.SOLIDPrinciples.ISP.BadCode;

public interface Machine {
	void print(Document doc);
	void scan(Document doc);
	void copy(Document doc);
}

// by this type for each machine all three methods are getting mandatory but this is failing
// Interface Segregation Principle