package com.Adactin.helper;

public class File_reader_manager {
	private  File_reader_manager() {
		
	}
	
	public static File_reader_manager getInstancefr() {
		File_reader_manager fr = new File_reader_manager();
		return fr;
		

	}

	
	public Configuration_reader getInstancecr() throws Throwable {
		Configuration_reader cr = new Configuration_reader();
		return cr;

	}
	
	
}
