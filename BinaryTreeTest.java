
public class BinaryTreeTest {

	public static void main( String[] args ) {
		
		
		
		int v[] = new int[] { 15, 6, 8, 21, 1, 14, 23, 9, 16, 7, 0, 3, 13, 20, 18, 31, 2, 4, 17, 10 };
		
		TreeNode[] node;
		node = new TreeNode[ v.length ];
		
		for( int i = 0 ; i < v.length ; i++ )
			node[ i ] = new TreeNode( v[ i ] );
		
		
		BinaryTree btree = new BinaryTree();
		btree.curr = btree.root;
		
		for( int i = 0 ; i < v.length ; i++ ) {
			
			btree.curr = btree.root;
			btree.addNode( node[i] );		
		}
			


		// this is comment
	
	}
}
