package com.dbpractice.app.db_practice.enity;

public class Student {
	private int studentId;
	private String pib;
	private int course;

        	public Student(){

                	}
	public Student(String pib, int course){
        		this.pib = pib;
        		this.course = course;
        	}

        	public void setId(int id){
        		studentId = id;
        	}
	public void setPib(String pib){
        		this.pib = pib;
        	}
	public void setCourse(int course){
        		this.course = course;
        	}

        	public int getId(){
        		return studentId;
        	}
	public String getPib(){
        		return pib;
        	}
	public int getCourse(){
        		return course;
        	}

        	public String toString(){
        		return (pib + " " + course);
        	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
