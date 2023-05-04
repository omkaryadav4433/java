
public class Bank {
   
	private int acctno;
	private String name;
	private Accounttype acctype;
	private double balence;
	


	public Bank(int acctno, String name, Accounttype acctype, double balence) {
		super();
		this.acctno = acctno;
		this.name = name;
		this.acctype = acctype;
		this.balence = balence;
	}

	public int getAcctno() {
		return acctno;
	}

	public void setAcctno(int acctno) {
		this.acctno = acctno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Accounttype getAcctype() {
		return acctype;
	}

	public void setAcctype(Accounttype acctype) {
		this.acctype = acctype;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	@Override
	public String toString() {
		return "Bank [acctno=" + acctno + ", name=" + name + ", acctype=" + acctype + ", balence=" + balence + "]";
	}

	
//	@Override
//	public boolean equals(Object o)
//	{
//		if (o instanceof Bank)
//		{
//			return this.acctno==((Bank)o).acctno;
//		}
//		return false;
	
//	}
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in act details");
		if(o instanceof Bank)
		return this.acctno==((Bank)o).acctno;
		return false;
	}
	@Override
	public int hashCode() 
	{
		System.out.println("in acct hC");
		return ((Integer)acctno).hashCode();
	}
	
	
	
}
