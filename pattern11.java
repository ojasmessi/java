 /*
 pattern:
    *****    n = 5 
   *****   space = n - i
  *****      stars = 5
 *****
*****
 */
public class pattern11 {
    public static void main(String args[]){
    int n=5;
    //outer loop -> rows
    for(int i=1; i<=n; i++){
        //spaces
        int space= n-i;
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
