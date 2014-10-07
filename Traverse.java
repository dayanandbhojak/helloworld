package traverse;

public class Traverse {
	
	
	public void traverse(int [][] mat, int rowSize, int columnSize) {
		int T=0, B=rowSize-1, L=0, R= columnSize-1;
		int dir=0;
		
	    	while( T<=B && L<=R ){
	    		
	    		if(dir==0){
	    			for(int i=L; i <=R; i++){
	    				System.out.print(mat[T][i]); System.out.print( " ");
	    			}
	    			T++;
	    		}
	    		
	    		else if(dir==1){
	    			for(int i=T; i <=B; i++){
	    				System.out.print(mat[i][R]); System.out.print( " ");
	    			}
	    			R--;
	    		}
	    		
	    		else if(dir==2){
	    			for(int i=R; i >=L; i--){
	    				System.out.print(mat[B][i]); System.out.print( " ");
	    			}
	    			B--;
	    		}
	    		
	    		else if(dir==3){
	    			for(int i=B; i >=T; i--){
	    				System.out.print(mat[i][L]); System.out.print( " ");
	    			}
	    			
	    			L++;
	    		}
	    			
	    		dir=(dir+1)%4;	
			
		}
	}
	
	public static void main(String[] args) {
		
		Traverse  sp=	new Traverse ();
		
		int [][] mat34={	{1, 2,  3 ,  4},
	            {5, 6,  7 ,  8},
	            {9, 10, 11, 12}
	           
 };
		
		// sp.traverse( 	mat34, 3,4 );
		 
		
		int [][] mat4={	{1, 2,  3 ,  4},
			            {5, 6,  7 ,  8},
			            {9, 10, 11, 12},
			            {13, 14, 15 ,16}
		 };
		sp.traverse( 	mat4, 4,4 );
				 
		 int [][] mat3={	{1, 2, 3 },
					{4, 5, 6},
					{7, 8, 9 }
					
				 };
		//sp.traverse( 	mat3, 3,3 );
		 
		int [][] mat2={	{1, 2 },
							{3, 4}							
						 };
		//sp.traverse( 	mat2, 2,2 );
						 
		//int [][] mat1={	{1 } };
		//sp.traverse( 	mat1, 1,1 );
				
		
		
	}

}
