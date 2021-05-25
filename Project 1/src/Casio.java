
public class Casio
{
		int num1, num2;
		String operation;

		public Casio()
		{
			num1 = 0;
			num2 = 0;
			operation= "Nothing";
		}
		public Casio(int i)
		{
		     num1 = i;
		     num2 = 0;
		     operation = "Nothing";
			}
		public Casio(int i,int j)
		{
		     num1 = i;
		     num2 = j;
		     operation = "Nothing";
			}
		public Casio(int i,int j,String add)
		{
		     num1 = i;
		     num2 = j;
		     operation = "add";
			}
		
		public static void main(String[]args)
		{
			Casio obj = new Casio(5,8,"Add");
			System.out.println(obj.num1 +obj.num2);
			System.out.println(obj.operation);
		}
		}
	
