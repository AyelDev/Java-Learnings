package com.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		BufferedReader fileRead = null;
		FileWriter fileWrite = null;
		try {
			fileRead = new BufferedReader(new FileReader("data.txt"));
			StringBuilder formatStringBuilder = new StringBuilder();
			String firstLine = fileRead.readLine();
			System.out.println(firstLine);
			String line;
			while ((line = fileRead.readLine()) != null) {
				line = line.trim();
				if (!line.isBlank()) {
					formatStringBuilder.append(line).append("\n");
					System.out.println(line);
				}
			}

			fileWrite = new FileWriter("data.txt");
			fileWrite.write(firstLine + "\n");
			fileWrite.write(formatStringBuilder.toString());

		

		} catch (FileNotFoundException e) {
			System.out.println("Oops, there is an error in the file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops, there has been an error reading/writing the file");
			e.printStackTrace();
		} finally {
			try {
				fileRead.close();
				fileWrite.close();
			}catch (Exception e) {
				// TODO: handle exception\
				System.out.println("There has been a problem in the file");
				e.printStackTrace();
			}
		}

	}
}
