
public class RevereseString {
	public static void main(String[] args)
	{
		String str="SMILE";
		int length=str.length();
		String reverse=" ";
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);	
	}
System.out.print("Reversed String is  "+reverse);
}
}
