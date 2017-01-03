package com.ly.util;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DBConfig {
	
	private static String ip;
	private static String port;
	private static String username;
	private static String password;
	
	public static String getIp() {
		return ip;
	}

	public static String getPort() {
		return port;
	}

	public static String getUsername() {
		return username;
	}

	public static String getPassword() {
		return password;
	}

	static{
		  Element element = null;
		  // ����ʹ�þ���·��
		  File f = new File("src/DBConfig.xml");
		  // documentBuilderΪ������ֱ��ʵ����(��XML�ļ�ת��ΪDOM�ļ�)
		  DocumentBuilder db = null;
		  DocumentBuilderFactory dbf = null;
		  try {
			   // ����documentBuilderFactory����
			   dbf = DocumentBuilderFactory.newInstance();
			   // ����db������documentBuilderFatory�����÷���documentBuildr����
			   db = dbf.newDocumentBuilder();
			   // �õ�һ��DOM�����ظ�document����
			   Document dt = db.parse(f);
			   // �õ�һ��elment��Ԫ��
			   element = dt.getDocumentElement();
			   // ��ø�Ԫ���µ��ӽڵ�
			   NodeList childNodes = element.getChildNodes();
			   // ������Щ�ӽڵ�
			   for (int i = 0; i < childNodes.getLength(); i++) {
				    // ���ÿ����Ӧλ��i�Ľ��
				   Node node1 = childNodes.item(i);
				   if ("DBConfig".equals(node1.getNodeName())) {
					   // ���<DBConfigs>�µĽڵ�
					   NodeList nodeDetail = node1.getChildNodes();
					   // ����<DBConfigs>�µĽڵ�
					   for (int j = 0; j < nodeDetail.getLength(); j++) {
						   // ���<DBConfigs>Ԫ��ÿһ���ڵ�
						   Node detail = nodeDetail.item(j);
						   if ("ip".equals(detail.getNodeName())){
							   //System.out.println("ip: " + detail.getTextContent()); // ���ip
							   ip = detail.getTextContent();
						   }
						   else if ("port".equals(detail.getNodeName())){
							   //System.out.println("port: " + detail.getTextContent());// ���port
							   port = detail.getTextContent();
						   }  
						   else if ("username".equals(detail.getNodeName())) {
							  //System.out.println("����: " + detail.getTextContent());// ���username
							   username = detail.getTextContent();
						   }	   
						   else if ("password".equals(detail.getNodeName())) {
							   //System.out.println("password: " + detail.getTextContent());// ���password
							   password = detail.getTextContent();
						   }		   
					   }
				   }
			   }
		  	}
		  catch (Exception e) {
			  e.printStackTrace();
	  	}
	}
}