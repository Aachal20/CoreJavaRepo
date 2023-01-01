package in.demo.varargs;


class VarArgs3{  

	static void display(String... values){  
		System.out.println("display method invoked ");  
		for(String s:values){  
			System.out.println(s);  
		}  
	}  

	public static void main(String args[]){  

		//display();                       //zero argument   
		//display("hello");          //one argument   
		display("my","name","is","varargs","Arya","Aachal");//four arguments  
	}   
}  