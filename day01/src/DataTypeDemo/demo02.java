package DataTypeDemo;
import java.util.Scanner;
public class demo02 {
public static void main(String[]arge){
	Scanner scan=new Scanner(System.in);
	double price ,money;
	int count;
	System.out.println("�����뵥�ۣ�");
	price=scan.nextDouble();
	System.out.println("������������");
	count=scan.nextInt();
	System.out.println("�������");
	money=scan.nextDouble();
	System.out.println("Ӧ�ս���"+(price*count)+"�����㣺��"+(money-(price*count))+"��");
}
}
