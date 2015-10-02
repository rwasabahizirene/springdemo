package com.ruby.projects.simpleprojects;

public class SpringTest {
	
	private SpringTest2 springTest2;
	private int val;
	public SpringTest(){
	}
    public String getMessage(){
    	return "Hello";
    }
    
    public String getSpringTestVal4Value(){
    	return springTest2.getVariable4();
    }

	public SpringTest2 getSpringTest2() {
		return springTest2;
	}

	public void setSpringTest2(SpringTest2 springTest2) {
		this.springTest2 = springTest2;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
}
