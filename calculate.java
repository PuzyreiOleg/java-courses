public class calculate {
	public static void main(String[] arg){
		System.out.println("Calculate");
		
		float first = Integer.valueOf(arg[0]);
		float second = Integer.valueOf(arg[1]);
		
		float summa = first + second;
		System.out.println("Summa = " + summa);
		
		float minus = first - second;
		System.out.println("Minus = " + minus);
		
		float Umn = first * second;
		System.out.println("Umnozhit' = " + Umn);
		
		if ( second != 0){
			float Del = first / (float)second;
			System.out.println("Delenie = " + Del);
		} else
			System.out.println("Na 0 delit' nelazia");
	}
}