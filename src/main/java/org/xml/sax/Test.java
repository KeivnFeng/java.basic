package org.xml.sax;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.xml.sax.helpers.XMLReaderFactory;

public class Test {

	public static void main(String args[]) throws SAXException, IOException{
		 // ͨ��XMLReaderFactory����XMLReader����  
        XMLReader reader = XMLReaderFactory.createXMLReader();  
        // �����¼�����������  
        XmlHander hander = new XmlHander();
        reader.setContentHandler(hander);  
        // ��ȡҪ������xml�ļ�  
        FileReader fileReader = new FileReader(new File("D:\\test.xml"));  
        // ָ��������xml�ļ�  
        reader.parse(new InputSource(fileReader)); 
        
        System.out.println(hander.text);
	}
}
