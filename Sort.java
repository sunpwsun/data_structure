
public class Sort {

	int n,m;
	Sort() {
		n=0;
		m=0;
	}
	
	int[] insertionSort( int[] array ) {
		
		for( int key = 1 ; key < array.length ; key++ ) {
			
			for( int j = key ; j > 0 ; j-- ) {
				
				if( array[ j ] < array[ j - 1 ] ) {		// swap
					
					int tmp = array[ j - 1 ];
					array[ j - 1 ] = array[ j ];
					array[ j ] = tmp;
				}
				else
					continue;
			}
		}
		
		return array;
	}
	
	
	
	int[] bubbleSort( int[] array ) {
		
		
		return array;
	}
	
	// This code was written by Sun
	void quickSort( int[] array, int x, int y ) {
		
		int left = x, right = y;
		int pivot = array[ x ];
		boolean rightTurn = true;
		
		while( left < right ) {
			
			if( rightTurn ) {
				
				if( array[ right ] < pivot ) {
					
					array[ left ] = array[ right ];
					left++;
					rightTurn = !rightTurn;
				}
				else {
					
					right--;
				}
			}
			else {
				
				if( array[ left ] > pivot ) {
					
					array[ right ] = array[ left ];
					right--;
					rightTurn = !rightTurn;
				}
				else {
					
					left++;
				}
			}
		}	
		
		if( left == right )	array[ left ] = pivot;
			
		for( int i = 0 ; i < array.length ; i++ )
			System.out.print( array[ i ] + ", ");
		System.out.println();
		
		
		if( x < left )		quickSort( array, x, left - 1 );
		if( y > right )		quickSort( array, left + 1, y );
		
		
	}
	
	// This code is from Cracking Code
    public void quickSort2( int[] data, int l, int r ){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
            while(data[left] < pivot) left++;   
            while(data[right] > pivot) right--;

            if(left <= right){                       
                int temp = data[left];           
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);                  
        
        /*       
		System.out.print( "" + m++ + ", " );
		
		for( int i = 0 ; i < data.length ; i++ )
			System.out.print( data[ i ] + "," );
		System.out.println();
*/        
        
        if(l < right) quickSort2(data, l, right);       
        if(r > left) quickSort2(data, left, r);           
    }	
}
