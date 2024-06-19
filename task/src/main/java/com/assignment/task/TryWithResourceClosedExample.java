package com.assignment.task;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourceClosedExample {

	public static void main(String[] args)  {
		String dataString = "Hello, World!.\n";
		ByteArrayInputStream inputStream = new ByteArrayInputStream(dataString.getBytes());
		try (BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream))){
			String lineString;
			while ((lineString = bReader.readLine()) != null) {
				System.out.println(lineString);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null) {
					inputStream.close();
					System.out.println(isClosed(inputStream));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static boolean isClosed(ByteArrayInputStream inputStream) {
		try {
			inputStream.read();
			return false;
		} catch (Exception e) {
			return true;
		}
	}

}
