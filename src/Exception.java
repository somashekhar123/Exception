
public class Exception implements Theme{
	
	public void show()
	{
		System.out.println(" Hello");
	}
	
	public static void main(String[] args) {
		Exception somu=new Exception();
		
		if(somu instanceof Theme)
		{
			somu.show();
		}
		
	}
}
 