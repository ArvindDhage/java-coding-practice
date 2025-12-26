public class Random_in_array {
    public static void main(String args[]){
        int a [] [] =new int [10] [20];

        for(int i=0;i<10;i++){
            for(int j=0;j<20;j++){
                a [i][j]=(int)(Math.random()*10000);
            }
            
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<20;j++){
                System.out.print(a[i] [j]+" ");
            }
            System.out.println();
        }
    }
    
}
