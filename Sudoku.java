import java.util.*;
public class Sudoku {


	
	public static void main( String[] agrs ) {
/*		
		SudoKuPlay sudoku = new SudoKuPlay();
		sudoku.complete();
		sudoku.showBoard();
*/		
		A a = new A();
		B b = new B();
		A ab = new B();

		a.m1();  
		b.m1();
		a.m2();
		b.m2();  
		
		if( ab instanceof A )
			System.out.println( "A");
		else
			System.out.println( "B");
		
		ab.m1(); 
		ab.m2(); 
		
		
		double[] dd = { 1.34, 0.87, 3.23, 2.0 };
		
		for( double e : dd ) {
		
			System.out.println(e);
		}
		
		printMax(new double[]{1, 2, 3});
	}
	
	public static void printMax(double... numbers) 
	{ 
	  if (numbers.length == 0) {
	    System.out.println("No argument passed");
	    return;
	  }
	  double result = numbers[0];
	  for (int i = 1; i < numbers.length; i++){
	    if (numbers[i] > result){
	      result = numbers[i];
	    }
	  }
	  System.out.println("The max value is " + result);
	}

}


class A{
	 public void m1()
	 {
		 System.out.println("m1 in A");
	 }
	 public static void m2()
	 {
		 System.out.println("m2 in A");
	 }	
}
class B extends A{
	 public void m1()
	 {
		 System.out.println("m1 in B");
	 }
	  
	 public static void m2()
	 {
		 System.out.println("m2 in B");
	 }
}



class SudoKuPlay {
	
	int [][] cells = { 	{ 0, 9, 8, 5, 0 ,0, 6, 0, 0 }, 
						{ 0, 3, 5, 1, 9, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 3, 0, 0, 5 },
						{ 0, 0, 0, 0, 5, 7, 2, 3, 6 },
						{ 5, 0, 2, 0, 3, 0, 9, 0, 7 },
						{ 3, 6, 7, 2, 4, 0, 0, 0, 0 },
						{ 2, 0, 0, 4, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 6, 2, 5, 1, 0 },
						{ 0, 0, 9, 0, 0, 5, 7, 2, 0 }
					};
	
	void complete() {
		
	}
	
	void showBoard() {
			
		for( int i = 0 ; i < cells.length ; i++ ) {
			
			if( i % 3 == 0 )
				System.out.println( " ----- ----- ----- " );

			for( int j = 0 ; j < cells[ i ].length ; j++ ) {
				
				if( j % 3 == 0 )
					System.out.print( "|" );
				
				if( cells[ i ][ j ] == 0 )		// if 0, replaces with blank
					System.out.print( " " );
				else
					System.out.print( cells[ i ][ j ] );
				
				if( j % 3 != 2 )
					System.out.print( " " );				
			}
			
			System.out.println( "|" );
		}
		System.out.println( " ----- ----- ----- " );
	}
}