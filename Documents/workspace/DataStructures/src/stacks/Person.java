package stacks;

public class Person {
	private String name;
	private String RollNo;
	public Person(String name, String RollNo){
		this.name=name;
		this.RollNo=RollNo;
	}
	public String toString(){
		return "Name= "+this.name+" "+ "Roll No= "+ this.RollNo;
	}
}
