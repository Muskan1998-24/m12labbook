package lab6;
import java.time.*;
public class Lab6_9 {
 public static void main(String[]args)
 {
	 String sDate1="24/03/1998";
	 String [] arr=sDate1.split("/");
	 LocalDate date=LocalDate.now();
	 System.out.println(date.getDayOfWeek());
	 System.out.println("Day difference="+Math.abs(Integer.parseInt(arr[0])-date.getDayOfMonth()));
	 System.out.println("Month difference="+Math.abs(Integer.parseInt(arr[1])-date.getMonthValue()));
	 System.out.println("Year difference="+Math.abs(Integer.parseInt(arr[2])-date.getYear())); 
 }
 
}
