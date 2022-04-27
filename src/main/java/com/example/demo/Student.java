package com.example.demo;

public class Student {
	
	private int id;
	private String name;
	private int pmarks;
	private int cmarks;
	private int mmarks;
	
	public Student(int id, String name, int pmarks, int cmarks, int mmarks) {
		super();
		this.id = id;
		this.name = name;
		this.pmarks = pmarks;
		this.cmarks = cmarks;
		this.mmarks = mmarks;
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

	public int getPmarks() {
		return pmarks;
	}

	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}

	public int getCmarks() {
		return cmarks;
	}

	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}

	public int getMmarks() {
		return mmarks;
	}

	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pmarks=" + pmarks + ", cmarks=" + cmarks + ", mmarks="
				+ mmarks + "]";
	}
	
	public String getGrade() {
		
		int total = cmarks+mmarks+pmarks;
		double avg = total/3;
		String grade ="";
		if(avg>=90 && avg<=100) {
			grade="A";
		}else if(avg >=80 &&avg<90){
			grade="B";
		}else if(avg >=70 &&avg<80){
			grade="C";
		}else if(avg<70){
			grade="F";
		}
		return grade;
		
	}
	

}
