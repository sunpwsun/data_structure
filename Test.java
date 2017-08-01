import java.util.*;

public class Test {

	public static void main( String[] agrs ) {
/*		
		LinkedList ll = new LinkedList();
		Node a, b, c, d, e, f;
		
		a = new Node( 100 );
		b = new Node( 101 );
		c = new Node( 102 );
		d = new Node( 103 );
		e = new Node( "Hello" );
		f = new Node( 99 );

		ll.appendNode( a );
		ll.appendNode( b );
		ll.appendNode( c );
		ll.appendNode( d, 1 );
		ll.appendNode( e, 3 );
		ll.appendNode( f, 2 );
		
		ll.printAllNodes();
		ll.removeNode( 5 );
		ll.removeNode( 1 );
		ll.removeNode( 1 );
		ll.removeNode( 1 );
		ll.removeNode( 1 );
		ll.removeNode( 0 );
		
		ll.printAllNodes();
		

		
		a = new Node( 100 );
		b = new Node( 101 );
		c = new Node( 102 );
		d = new Node( 103 );
		e = new Node( "Hello" );
		f = new Node( 99 );
		
		Stack stk = new Stack();
		
		System.out.println( stk.pop() );
		stk.push( new Node( 0 ) );
		stk.push( new Node( 1 ) );
		stk.push( new Node( 2 ) );
		stk.push( new Node( 3 ) );
		stk.push( new Node( 4 ) );
		stk.push( new Node( 5 ) );
		
		System.out.println( stk.pop() );
		System.out.println( stk.pop() );
		
		stk.push( new Node( "a" ) );
		stk.push( new Node( "b" ) );	
		
		System.out.println( stk.pop() );
		System.out.println( stk.pop() );
		System.out.println( stk.pop() );
		System.out.println( stk.pop() );
		System.out.println( stk.pop() );
		System.out.println( stk.pop() );
		System.out.println( stk.pop() );
		
*/

	//	int[] array = { 8, 7, 14, 4, 9, 1, 11, 5, 12, 0, 10, 19, 48, 55, 66, 22, 28, 4, 8, 14, 2, 100, 18, 83, 92, 43, 21, 5, 34, 74, 23, 90, 37, 71, 80, 92, 95, 77, 75, 54, 72, 19 };
	
		int[] array = { 8, 7, 14, 4, 9, 1, 11, 5, 12, 0, 10 };
/*		int num = 100000000;
		Random r = new Random();
		int[] array = new int[ num ];
		int[] array2 = new int[ num ];
		
		
		for( int i = 0 ;i < num ; i++) {
		
			array[ i ] = r.nextInt( num );
			array2[ i ] = array[ i ];
		}
*/	
		long s, e;
		
		s = System.currentTimeMillis();
		
		new Sort().quickSort(array, 0, array.length - 1);
		
		e = System.currentTimeMillis();
		System.out.println( "finish : " + ( e - s ) );
		
		
		
		System.out.println( "-----------------------------------");
		
		s = System.currentTimeMillis();
		
//		new Sort().quickSort2( array2, 0, array.length - 1 );
		
		
		e = System.currentTimeMillis();
		System.out.println( "finish : " + ( e - s ) );

		
		
//		for( int i = 0 ; i < array.length ; i++ )
//			System.out.print( array[ i ] + "," );
	}
	

}