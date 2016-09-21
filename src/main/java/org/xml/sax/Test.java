package org.xml.sax;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.xml.sax.helpers.XMLReaderFactory;

public class Test {

	public static void main(String args[]) throws SAXException, IOException{
		 // 通过XMLReaderFactory创建XMLReader对象  
        XMLReader reader = XMLReaderFactory.createXMLReader();  
        // 设置事件处理器对象  
        XmlHander hander = new XmlHander();
        reader.setContentHandler(hander);  
        // 读取要解析的xml文件  
        FileReader fileReader = new FileReader(new File("D:\\test.xml"));  
        // 指定解析的xml文件  
        reader.parse(new InputSource(fileReader)); 
        
        System.out.println(hander.text);
	}
}
