package com.sushmit.StructuralPattern.CompositePattern.GoodCode;

public class FileSystemApp {
	public static void main(String[] args) {
		FileSystemComponent file1 = new File("File1.txt");
		FileSystemComponent file2 = new File("File2.txt");
		
		Folder folder = new Folder("Documnets");
		folder.addComponent(file1);
		folder.addComponent(file2);
		
		// Subfolder
		Folder subFolder = new Folder("Subfolder");
		
		FileSystemComponent file3 = new File("File3.txt");
		subFolder.addComponent(file3);
		
		folder.addComponent(subFolder);
		
		folder.showDetails();
	}
}
