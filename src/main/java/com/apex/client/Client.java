package com.apex.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.apex.server.BasicCalc;
import com.apex.server.Calc;

public class Client {
	Calc rr = null;
	


	public Calc getRr() {
		return rr;
	}

	public void setRr(Calc rr) {
		this.rr = rr;
	}

	public static void main(String[] args){
		Client client = (Client) getBeanFactory().getBean("client");
		client.calloperations();
	}

	public void calloperations() {
		int var1 = rr.add(4, 5);
		int var2 = rr.sub(4, 5);
		int var3 = rr.mult(4, 5);
		int var4 = rr.div(4, 5);
		
		System.out.println("Sum : " + var1);
		System.out.println("Diff : " + var2);
		System.out.println("Product : " + var3);
		System.out.println("Division : " + var4);
	}
	
	public static BeanFactory getBeanFactory(){
		Resource resource =  new FileSystemResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		return beanFactory;
		
	}

}
