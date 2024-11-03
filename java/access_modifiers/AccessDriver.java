import Access.AccessClass;
public class AccessDriver extends AccessClass {
	public static void main (String [] args) 
	{
		AccessDriver ad = new AccessDriver ();
		ad.displaypublic ();
		ad.calldisplayprivate ();
		ad.displayprotected ();
	}
}
