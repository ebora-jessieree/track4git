package org.ssglobal.training.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.util.stream.Collectors;

public class FunList {
	//Step 1 : create a logger
	private static Logger logger  = Logger.getLogger(FunList.class.getName());
	private BufferedReader bufferedReader;
	private Word word;//injectables
	
	
	{
		//Step 2: Creating another handler
		//Step 3: Format the message
		try {
			FileHandler fileHandler = new FileHandler("src/log/funlist.log", true);
			fileHandler.setEncoding("UTF-8");
			fileHandler.setLevel(Level.WARNING);
			
			//XMLFormatter formatter = new XMLFormatter();
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
			logger.addHandler(fileHandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.setLevel(Level.INFO);
	}
	
	
	
	
	public FunList() {
		
	}
	
	public FunList(String filename) {
		Path path = Paths.get(filename);
		try {
			this.bufferedReader = Files.newBufferedReader(path);
		} catch (IOException e) {
			logger.severe("Error message: " + e.getMessage());
		}
	}
	
	public long countWords() {
		logger.info("execute countWords");
		long temp =  this.bufferedReader.lines().map((str)->{
			return str.split(" ");}).count();
		logger.info("exit without errors countWords");
		return temp;
	}
	
	public void showLines() {	
		logger.info("execute showLines");
		this.bufferedReader.lines().forEach((line)->{
			System.out.print(line);
		});
		logger.info("exit without errors showLines");
	}
	
	public List <String> getContentList(){ 
		logger.info("execute getContentList");
		List<String> temp = this.bufferedReader.lines().collect(Collectors.toList());
		logger.info("exit without errors getContentList");
		return temp;
	}
	
	public String[] getContentArray(){ 
		//return this.bufferedReader.lines().toArray(String[]::new);
		logger.info("execute getContentArray");
		String[] temp =  (String[]) this.bufferedReader.lines().toArray();
		logger.info("exit without errors getContentArray");
		return temp;
	}
	
	public static String processStr(String str1, String str2) {
		logger.info("execute processStr");
		String temp =  String.join(" ", str1, str2);
		logger.info("exit without errors processStr");
		return temp;
	}
	
	
	@SuppressWarnings("deprecation")
	public boolean enableDisplay() {
		logger.info("Execute enableDisplay");
		
		logger.warning("Custom Date is deprecated");
		Date xmas = new Date(121,11,25);
		
		try {
			if(this.bufferedReader.lines().toArray(String[]::new).length > 0) {
				showLines();
				logger.info("Exit without errors enableDisplay");
				return true;
			}
			
		}catch(Exception e) {
			logger.severe("Error message: " + e.getMessage());
		}
		
		logger.info("Execute with errors enableDisplay");
		return false;
	}
}

class Word{
	
}
