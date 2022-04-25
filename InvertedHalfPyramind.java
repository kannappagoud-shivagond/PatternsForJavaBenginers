public class InvertedHalfPyramind {
    public static void main(String[] args) {
        int n = 5;
        //inner loop
        for(int i=1; i<=n; i++){
            //outer loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();

        
        }
    }
    
}
