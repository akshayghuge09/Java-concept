package exceptions;

public class UncheckedExceptions {
	public static void main(String[] args) {
		try 
		{
			String invalidNumber = "abc";
			int parsedNumber = Integer.parseInt(invalidNumber);
			System.out.println(parsedNumber);
		} 
		catch (NumberFormatException e) {
			System.out.println("Number Format Exception caught: " + e.getMessage());
		}

		try 
		{
			int[] array = { 1, 2, 3 };
			int element = array[5];
			System.out.println(element);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception caught: " + e.getMessage());
		}

		try 
		{
			int result = 10 / 0;
			System.out.println(result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught: " + e.getMessage());
		}

		try 
		{
			String str = null;
			int length = str.length();
			System.out.println(length);
		} 
		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception caught: " + e.getMessage());
		}

		try 
		{
		
			Class.forName("com.example.NonExistentClass");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception caught: " + e.getMessage());
		}
	}

}
