package com.redbus.practiceDemo;

import java.io.File;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.asprise.ocr.Ocr;
import com.aventstack.extentreports.markuputils.Markup;
import com.redbus.ExtentLib.ExtentTestManager;
import com.redbus.Utills.ActionUtils;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class JavaOCRTextValidation {

    @Test
    public void dataProviderTest() throws TesseractException{
    	File imageFile = new File("C:\\Users\\Automation\\git\\repository2\\com.redbus\\Screenshot\\airtel money payment failed.png");
    	Ocr.setUp();
/*    	Ocr ocr = new Ocr(); // create a new OCR engine
		ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
		// path of the image
		File imageFile = new File("C:\\Users\\Automation\\git\\repository2\\com.redbus\\Screenshot\\airtel money payment failed.png");
        	String s = ocr.recognize(new File[] { new File("C:\\Users\\Automation\\git\\repository2\\com.redbus\\Screenshot\\airtel money payment failed.png") },
		Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println(s);
		s.contains("Awesome");
		String[] stringarr = s.split("/n");
		for(String arr:stringarr)
		{
			System.out.println(arr);
			arr.contains("Awesome");
		}
		
		ocr.stopEngine(); */// Stop OCR engine
//        System.out.println("My Name is " + name);
		 // get the Tesseract direct interace
        Tesseract instance = new Tesseract();
        instance.setDatapath("C:\\Users\\Automation\\git\\repository2\\com.redbus\\tessdata");

        // the doOCR method of Tesseract will retrive the text
        // from image captured by Selenium
        String result = instance.doOCR(imageFile);
        System.out.println(result);
        ActionUtils.logger.info("The extracted String ---------"+result);
        ExtentTestManager.test.pass("The extracted String ---------"+result);
    }
}


