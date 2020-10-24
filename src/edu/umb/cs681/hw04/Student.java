package edu.umb.cs681.hw04;

public class Student {
	//properties
	private String name;
	private int id;
	private int age;
	private char gender;
	private float height;
	private float weight;
	
	//public Student() {}
	
	//constructor
	public Student (String name, int id, int age, char gender, float height, float weight) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	//getters and setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return this.gender;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getHeight() {
		return this.height;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getWeight() {
		return this.weight;
	}
	
	
	
	
	
	
}