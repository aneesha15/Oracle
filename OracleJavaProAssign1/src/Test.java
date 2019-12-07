class Test1
{
	void display()
	{
		System.out.println("this is test1");
	}
	void add()
	{
		int a,b=8,c=8;
		a=c+b;
		System.out.println("value is" +a);
	}
	void sub()
	{
		int a,b=8,c=8;
		a=c-b;
		System.out.println("value is" +a);
	}
}
class Test2
{
	void display()
	{
		System.out.println("this is test2");
	}
	void mul()
	{
		int a,b=8,c=8;
		a=c*b;
		System.out.println("value is" +a);
	}
	void div()
	{
		int a,b=8,c=8;
		a=c/b;
		System.out.println("value is" +a);
	}
}
class Test3
{
	void display()
	{
		System.out.println("this is test3");
	}
	void area()
	{
		 double side = 4.5;
	       double area = side*side; 
	       System.out.println("Area of Square is: "+area);
	}
	void area1()
	{
		double length = 4.5;
		   double width = 8.0;
		   double area = length*width;
		   System.out.println("Area of Rectangle is:"+area);
	}
}
class Test4
	{
		void display()
		{
			System.out.println("this is test4");
		}
		void area2()
		{
			double base = 20.0;
		      double height = 110.5;
		      double area = (base* height)/2;
		      System.out.println("Area of Triangle is: " + area);
		}
		void area3()
		{
			  int radius = 3;
		      double area = Math.PI * (radius * radius);
		      System.out.println("The area of circle is: " + area);
		      double circumference= Math.PI * 2*radius;
		      System.out.println( "The circumference of the circle is:"+circumference) ;
		}
	}
class Test5
	{
		void display()
		{
			System.out.println("this is test5");
		}	
		void charc()
		{
			 char ch = 'a';
		      String str = Character.toString(ch);
		      System.out.println("String is: "+str);
		}
		void string()
		{
			char ch = 'a';
			 String str2 = String.valueOf(ch);
		      System.out.println("String is: "+str2);
		}
	}
public class Test 
{
	public static void main(String[] args)
	{
		Test1 t1=new Test1();
		t1.display();
		t1.add();
		t1.sub();
		Test2 t2=new Test2();
		t2.display();
		t2.mul();
		t2.div();
		Test3 t3=new Test3();
		t3.display();
		t3.area();
		t3.area1();
		Test4 t4=new Test4();
		t4.display();
		t4.area2();
		t4.area3();
		Test5 t5=new Test5();
		t5.display();
		t5.charc();
		t5.string();
	}
}
