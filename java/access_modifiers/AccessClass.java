package Access;
public class AccessClass {

		public void displaypublic () {
			System.out.println ("This is the public method ");
		}

		private void displayprivate () {
			System.out.println ("This is the private method called by callprivatedisplay method  ");
		}

		protected void displayprotected () {
			System.out.println ("This is the protected method ");
		}

		public void calldisplayprivate() {
			displayprivate ();
		}
	
}
