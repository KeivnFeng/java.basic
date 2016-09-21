package org.xml.sax;

import org.xml.sax.helpers.DefaultHandler;

public class XmlHander extends DefaultHandler{

	StringBuffer text = new StringBuffer();
	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(arg0, arg1, arg2);
		System.out.println("------------------------------endElement start----------------------------------------------");
		System.out.println("uri:::" + arg0);
		System.out.println("localName:::" + arg1);
		System.out.println("qName:::" + arg2);
		System.out.println("------------------------------endElement end----------------------------------------------");
		
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(arg0, arg1, arg2, arg3);
		
		System.out.println("------------------------------startElement start----------------------------------------------");
		System.out.println("uri:::" + arg0);
		System.out.println("localName:::" + arg1);
		System.out.println("qName:::" + arg2);
		
		
		for(int i = 0; i < arg3.getLength(); i++){
			String value = arg3.getValue(i);
			System.out.println(arg3.getQName(i) + "------" + value);
		}
		
		System.out.println("------------------------------startElement end----------------------------------------------");
	}
	
	 public void characters(char[] ch, int start, int length)  
             throws SAXException {  
         // TODO Auto-generated method stub  
         super.characters(ch, start, length);  
         // 当解析的标识符为true时,打印元素的内容  
         text.append(new String(ch, start, length));  
     }   

}
