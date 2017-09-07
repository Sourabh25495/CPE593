package stacks;

public class Main {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		IntStack intstack= new IntStack();
		if(!intstack.isFull()){
			intstack.push(2);
			intstack.push(4);
			intstack.push(6);
			intstack.push(9);
			
		}
		System.out.println(intstack.pop());
		System.out.println(intstack.pop());
	}  */
		Person person1= new Person("Sou  ", "1");
		Person person2= new Person("pran  ", "2");
		
		PersonStack stack=new PersonStack();
		stack.push(person1);

		stack.push(person2);
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
}
}
