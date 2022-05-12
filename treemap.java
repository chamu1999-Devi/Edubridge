package datatypes;

public class treemap {

	public static void main(String[] args)
	{
		
		enum Level
		{
			LOW,MEDIUM,HIGH
		}
			
		enum Color
		{
			red,yellow,blue,golden
		}
		Level name=Level.MEDIUM;
		System.out.println(name);
		
		Color name1=Color.golden;
		System.out.println("colour is:" +name1);

	}

}
