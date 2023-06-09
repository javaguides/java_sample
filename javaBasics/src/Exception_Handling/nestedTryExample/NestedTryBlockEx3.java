package Exception_Handling.nestedTryExample;

public class NestedTryBlockEx3 {

	public static void main(String[] args) {
		String str = "Scientech Easy";
		int x[] = { 0, 1, 2, 3, 4 };

		try // Outer try block
		{
			int slength = str.length();
			System.out.println("String length: " + slength);

			try // Inner try block
			{
				int y = 6;
				System.out.println(x[y]); // Exception occurred.
			} catch (ArithmeticException ae) // No match is found.
			{
				System.out.println("Exception is thrown");
				System.out.println(ae.toString());
			}
		} catch (ArrayIndexOutOfBoundsException aie) // Match found.
		{
			System.out.println("Exception is thrown ");
			System.out.println(aie.toString());
		}
		System.out.println("I am out of outer catch block");
	}
}
