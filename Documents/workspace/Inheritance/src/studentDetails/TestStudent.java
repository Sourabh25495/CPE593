package studentDetails;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student t=new Student();
		t.setID(100);
		t.setName("Sourabh");
		t.setAddress("NYC");
		t.setSalary(90000);
		System.out.println("Id is= "+t.getID());

		System.out.println("Namae is= "+ t.getName());

		System.out.println("Address is= "+ t.getAddress());
		

		System.out.println("Salary is= "+t.getSalary());
			
			
	}

}
