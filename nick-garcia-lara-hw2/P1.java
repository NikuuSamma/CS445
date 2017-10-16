public class A
{
	public void functionA(B b)
	{
	
	}
}

public class B
{
	public B()
	{
		
	}
}

public class C extends A
{
	public void functionC(D d)
	{
	
	}
}

public class D
{
	private F[] classF;
	ArrayList<F> bList = new ArrayList<F>();
	
	public D()
	{
		classF = new F[2];
		classF[0]= new F();
		classF[1]= new F();
		
		bList.add(new B();
	}	
}

public class E extends C
{
	
}

public class F
{
	private D[] classD;
	ArrayList<D> dList = new ArrayList<D>();
	
	public F()
	{
		classD = new D[5];
		classD[0]= new B();
		classD[1]= new B();
		classD[2]= new B();
		classD[3]= new B();
		classD[4]= new B();
	}
}