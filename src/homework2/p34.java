package homework2;

public class p34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 10, num2= 5;
				
		System.out.println("num1和num2的各種運算");
		System.out.println("num1+num2等於"+(num1+num2));
		System.out.println("num1-num2等於"+(num1-num2));
		System.out.println("num1*num2等於"+(num1*num2));
		System.out.println("num1/num2等於"+(num1/num2));
		System.out.println("num1%num2等於"+(num1%num2));
		
		int a=0, b=0, c=0;
		b=a++;
		c=++a;
		
		System.out.println("因為是在指定值後才遞增的，所以b的值是:"+b);
		System.out.println("因為是在遞增後才指定值的，所以c的值是:"+c);
	}
}