
public class Nonparameterized {
	package day_3;

	public class Nonparameterized
	{
		String str;
		int a;
		Nonparameterized()
		{
			str="Arya";
			a=11;
		}
		void display()
		{
			System.out.println(str+" "+a);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Nonparameterized c=new Nonparameterized();
			c.display();
		}

	}
}
