package om.shiyanlou;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Car {
	private static final Scanner scan = null;
	public String name;
	public String tank;
	public String oilConsumption;
	public void gas(){
		System.out.println("no more gass");
	}
	public void run() {
			System.out.println("it could be run");
	}

	public static void main(String[] args) {
			int size =3;
			Car c=new Car();
			String[] a=new String[size];
			for(int i=0;i<a.length;i++) {
				switch(i) {
				case 1:
					try{	
						System.out.println("������������");
					
					c.name=(a[i]=scan.nextLine());
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog( null, "������һ���ǿ�ֵ");
					}
					break;
				case 2:
					try {
					System.out.println("����������������");
					c.tank=(a[i]=scan.nextLine());
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog( null, "������һ���ǿ�ֵ");
					}
					break;
				case 3:
					try {
					System.out.println("�������������ͺ�");
					c.oilConsumption=(a[i]=scan.nextLine());
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog( null, "������һ���ǿ�ֵ");
					}
					break;
				default:
					break;
				}
				System.out.println("�������ͺţ����䣬�ͺ� ���£�");
				for(int j=0;j<a.length;j++) {
					System.out.println(a[i]);
				}
			}
			/*for(int i=0;i<a.length;i++) {
				String A="name";
				if(i==1)A="tank";
				if(i==2)A="oilConsumption";
				System.out.println("please input the "+A);
				c.a=(a[i]=System.lineSeparator().toString());
			}*/
	}
	

}
