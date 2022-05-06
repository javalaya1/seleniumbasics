package com.myyesm.seleniumbasics.learning_topic_02_read_data_from_propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LearningHowToReadDataFromPropertiesFile {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("testdata\\config.properties")){
			Properties p = new Properties();
			p.load(fis);
			String bn = p.getProperty("config.browsername");
			System.out.println(bn);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}


/*
//files will close automatically after reading it.


try( 1) give file location  ){
2) tell it's properties file
3) load the file
4) take data from the file
5) print the data

}catch(IOException e){

}

try(){

}catch(IOEXceptopm e){}



*/