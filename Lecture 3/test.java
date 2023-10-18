package assignment1;

class myNumber{
	private int num;
	public int num2;
	public myNumber(){
	num=0;
	num2=100;
	}
	int getNum(){
	return num;
	}
	int getnum2() {
		return num2;
	}
	
     void description() {
		System.out.println("Num: " + num + " Num 2: " + num2);
		
	}
     
     float average() {
   	return (float)(num+num2)/2;
 		
 	}
	void setNum(int i) {
	num=i;
	num2=10*i;
	}
	}

public class Myclass {


	public static void main(String[] args) {
		myNumber A=new myNumber();
		System.out.println(A.getNum());
		A.setNum(10);
		System.out.println(A.getNum());
		System.out.println(A.num2);
	}
		
        myNumber F = new myNumber (13, 10);{
		
		F.description();
		
		System.out.println("The average of these two numbers is: " + F.average());
       
	}
}

