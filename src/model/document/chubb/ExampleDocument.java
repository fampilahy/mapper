package model.document.chubb;

import model.document.AbstractDocument;

public class ExampleDocument extends AbstractDocument{
	
	
	
	//TODO
	
	
	private int id;
	private String name;
	private String pass;
	private int salary;

	
	public ExampleDocument(int id,String name, String pass,int salary){
		this.id=id;
		this.name=name;
		this.pass=pass;
		this.salary=salary;
	}
	
	public ExampleDocument() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	

}
