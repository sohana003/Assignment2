import java.util.Scanner;
public class mainclass {

	public static void main(String[] args)
	{
		double hr1,wr1,ht1,wt1,h1,a1,b1;
		
		polygon ob1=new Rectangle();
		ob1.show();
		
		System.out.println("Enter the height and width of rectangle: ");
		Scanner scan=new Scanner(System.in);
				hr1=scan.nextDouble();
				Scanner scan1=new Scanner(System.in);
				wr1=scan1.nextDouble();
				
				
				Rectangle r1=new Rectangle();
				r1.rec_para(hr1, wr1);
				double are=r1.area();
				System.out.println("The area of rectangle is: "+are);
				
				
				polygon ob2=new Triangle();
				ob2.show();
						
				System.out.println("Enter the height and width of triangle: ");
				Scanner scan2=new Scanner(System.in);
						ht1=scan2.nextDouble();
						Scanner scan3=new Scanner(System.in);
						wt1=scan3.nextDouble();
						
						
						
						Triangle t1=new Triangle();
						t1.tri_para(ht1, wt1);
						double tri_area=t1.area();
						System.out.println("The area of Triangle is: "+tri_area);
						
						
						polygon ob3=new Trapezoid();
						ob3.show();
						
						System.out.println("Enter the distance of the parallel sides and the length of the sides: ");
						Scanner scan4=new Scanner(System.in);
						        h1=scan4.nextDouble();
						        Scanner scan5=new Scanner(System.in);
								a1=scan5.nextDouble();
								Scanner scan6=new Scanner(System.in);
								b1=scan6.nextDouble();
								
								
								Trapezoid tra1=new Trapezoid();
								tra1.tra_para(h1, a1,b1);
								double tra_area=tra1.area();
								System.out.println("The area of Triangle is: "+tra_area);
								
								
								
		}
	
}
