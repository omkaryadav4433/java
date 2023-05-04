import java.util.HashSet;



public class BankTester {

	public static void main(String[] args) {
		Bank acct1= new Bank (101,"ram ",Accounttype.SAVING, 12000);
		Bank acct2= new Bank (10,"sham",Accounttype.CURRENT, 4000);
		Bank acct3= new Bank (101,"geeta",Accounttype.SAVING, 4000);
		Bank acct4= new Bank (111,"seeta",Accounttype.SAVING, 4000);
		
		HashSet<Bank>acct=new HashSet<>();
		System.out.println("added " + acct.add(acct1));
		System.out.println("added " + acct.add(acct2));
		System.out.println("added " + acct.add(acct3));
		System.out.println("added " + acct.add(acct4));
		
		System.out.println("size"+acct.size());
		
		for (Bank a : acct)
			System.out.println(a);
//	for(Bank accounts:acct)
//			System.out.println(acct);
	System.out.println(acct1.equals(acct3));
		
	System.out.println(acct1.hashCode()+" "+acct3.hashCode());

	}

}
