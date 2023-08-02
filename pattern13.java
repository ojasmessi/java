/*
 pattern: 
         1               n = 5 
       2 1 2           space = n - i
     3 2 1 2 3         left part (2 to 1, 3 to 1, 4 to 1, 5 to 1)  =  i to 1 (backward loop)
   4 3 2 1 2 3 4       right par (2 , 2 to 3, 2 to 4, 2 to 5 )  =  2 to i    (forward loop)
 5 4 3 2 1 2 3 4 5
 */
public class pattern13 {
    public static void main(String args[]){
    

        int n = 5;

        //rows
        for(int i=1; i<=n; i++){

            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //left part -> i to 1
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
//right part  -> 2 to i
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
