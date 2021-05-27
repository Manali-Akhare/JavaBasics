interface Writer {
void write();
}
class Pen implements Writer
{
	public void write() {
		System.out.println("Its a Pen");
		}
	}
class Pencil implements Writer
{
	public void write() {
		System.out.println("Its a Pencil");
		}
	}
final class Book
{
	public void write(Writer p)
	{
		p.write();
	}
}
public class InterfaceDemo1
{
public  void main(String[]args)
{
Book b =new Book();
Writer p= new Pen();
Writer pc = new Pencil();
b.write(pc);
b.write(p);
}
}
