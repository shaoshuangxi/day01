package DataTypeDemo;
import java.util.Scanner;
public class demo02 {
public static void main(String[]arge){
	Scanner scan=new Scanner(System.in);
	double price ,money;
	int count;
	System.out.println("请输入单价：");
	price=scan.nextDouble();
	System.out.println("请输入数量：");
	count=scan.nextInt();
	System.out.println("请输入金额：");
	money=scan.nextDouble();
	System.out.println("应收金额：￥"+(price*count)+"。找零：￥"+(money-(price*count))+"。");
}
}
