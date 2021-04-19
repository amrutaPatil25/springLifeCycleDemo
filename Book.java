package com.spring.model;

import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean,BeanFactoryAware,DisposableBean,BeanNameAware,BeanClassLoaderAware
{
	String name;
	 public Book(String name) {
		super();
		this.name = name ;
			}

	
	
public Book()
{
	System.out.println("Inside constructor...");
	name = "Java";
	
}
@Override
public void setBeanClassLoader(ClassLoader arg0) {
	// TODO Auto-generated method stub
	System.out.println("BeanClassLoaderAware.setBeanClassLoader.....");
	
}
@Override
public void setBeanName(String arg0) {
	// TODO Auto-generated method stub
	System.out.println("BeanNameAware.setBeaname called...");
	
}

public void myPostContruct()
{
	System.out.println("my postconstruct method.....");
}


public void springPostConstruct()
{
	System.out.println("@postConstruct...");
}
@Override
public void setBeanFactory(BeanFactory arg0) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println( "BeanFactoryAware.setBeaFactory called");
	
}
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
	System.out.println("After properties set called....");
	
}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("setBookName : Book name has set");
		
	}
	public void myPreDestroy(){
		System.out.println("destroy method... " );
	}
	@PreDestroy
public void springPreDestroy()
{
	System.out.println("@PreDestroy...");
}

	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Disposable.destroy called...");
	}
	

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("inside finalize....");
	}



	@Override
	public String toString() {
		return "Book [Name =" + name + "]";
	}


	
	
	

}
