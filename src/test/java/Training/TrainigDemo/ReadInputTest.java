package Training.TrainigDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ReadInputFromExcel input=new ReadInputFromExcel();
		input.readExcel();
		ArrayList<InputFormat> arrList=new ArrayList<InputFormat>();
		arrList=input.arrList;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter ID");
		String s1=sc.nextLine();
		//System.out.println(s1);
		//System.out.println(arrList.get(1).getId());
		
		System.out.println(arrList.get(1).getId().equalsIgnoreCase(s1));
		if(arrList.get(1).getId().equals(s1)){
		 
			
			System.out.println(arrList.get(1).getId());
			System.out.println(arrList.get(1).getCity());
			System.out.println(arrList.get(1).getSt());
			System.out.println(arrList.get(1).getLat_n());
			System.out.println(arrList.get(1).getLong_w());
			 
		 
		}else if(s1.equalsIgnoreCase("column")){
			
			System.out.println(arrList.get(1).getId());
			System.out.println(arrList.get(2).getId());
			System.out.println(arrList.get(3).getId());
			System.out.println(arrList.get(4).getId());
			System.out.println(arrList.get(5).getId());

		}
		 
	}

}
