package com.wc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.csvreader.CsvWriter;
public class CsvDataWriting {
	
	



	    public static void createCSVFile(String SerialNo,String PostName, String AdvertisementDetails, String Online_Apply,String LastDate, String Address)
	    {
	        //define output file name
	        String csvOutputFile = "writetest.csv";
	        //check if file exist
	        boolean isFileExist = new File(csvOutputFile).exists();
	            try {
	                //create a FileWriter constructor to open a file in appending mode
	                CsvWriter testcases = new CsvWriter(new FileWriter(csvOutputFile, true), ',');
	                //write header column if the file did not already exist
	                if(!isFileExist)
	                {
	                	testcases.write("S.No");
	                	testcases.write("Post Name");
	      	            testcases.write("Advertisement Details");
	      	            testcases.write("Online/Apply");
	      	            testcases.write("Last Date");
	      	            testcases.write("Address");
	      	          
	                    //end the record
	                    testcases.endRecord();
	                }
	             //add record to the file
	                testcases.write(SerialNo);
	               
	                testcases.write(PostName);
	                testcases.write(AdvertisementDetails);
	                testcases.write(Online_Apply);
	                testcases.write(LastDate);
	                testcases.write(Address);
	                //end the record
	                testcases.endRecord();
	                //close the file
	                testcases.close();

	            } catch (IOException e) {
	                e.printStackTrace();
	            }

	        }
	    }

