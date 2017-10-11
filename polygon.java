
public class polygon {

	protected double hr,wr,ht,wt,h,a,b;
	
	public void show()
	{
		System.out.println("This is polygon");
		
	}
	
	public  void rec_para(double hr_,double wr_)
	{
		        hr=hr_;
				wr=wr_;
	}
	public  void tri_para(double ht_,double wt_)
	{
		        ht=ht_;
				wt=wt_;
	}
	public  void tra_para(double h_,double a_,double b_)
	{
		        h=h_;
				a=a_;
				b=b_;
	}
}
