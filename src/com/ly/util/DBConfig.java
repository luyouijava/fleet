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
		  // 可以使用绝对路劲
		  File f = new File("src/DBConfig.xml");
		  // documentBuilder为抽象不能直接实例化(将XML文件转换为DOM文件)
		  DocumentBuilder db = null;
		  DocumentBuilderFactory dbf = null;
		  try {
			   // 返回documentBuilderFactory对象
			   dbf = DocumentBuilderFactory.newInstance();
			   // 返回db对象用documentBuilderFatory对象获得返回documentBuildr对象
			   db = dbf.newDocumentBuilder();
			   // 得到一个DOM并返回给document对象
			   Document dt = db.parse(f);
			   // 得到一个elment根元素
			   element = dt.getDocumentElement();
			   // 获得根元素下的子节点
			   NodeList childNodes = element.getChildNodes();
			   // 遍历这些子节点
			   for (int i = 0; i < childNodes.getLength(); i++) {
				    // 获得每个对应位置i的结点
				   Node node1 = childNodes.item(i);
				   if ("DBConfig".equals(node1.getNodeName())) {
					   // 获得<DBConfigs>下的节点
					   NodeList nodeDetail = node1.getChildNodes();
					   // 遍历<DBConfigs>下的节点
					   for (int j = 0; j < nodeDetail.getLength(); j++) {
						   // 获得<DBConfigs>元素每一个节点
						   Node detail = nodeDetail.item(j);
						   if ("ip".equals(detail.getNodeName())){
							   //System.out.println("ip: " + detail.getTextContent()); // 输出ip
							   ip = detail.getTextContent();
						   }
						   else if ("port".equals(detail.getNodeName())){
							   //System.out.println("port: " + detail.getTextContent());// 输出port
							   port = detail.getTextContent();
						   }  
						   else if ("username".equals(detail.getNodeName())) {
							  //System.out.println("姓名: " + detail.getTextContent());// 输出username
							   username = detail.getTextContent();
						   }	   
						   else if ("password".equals(detail.getNodeName())) {
							   //System.out.println("password: " + detail.getTextContent());// 输出password
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