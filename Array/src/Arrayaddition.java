
public class Arrayaddition {
    public static void main(String[] args) {
        int arr1[][] ={{1,2,3},{2,3,1},{4,3,5}};
        int arr2[][] ={{4,3,2},{6,8,7},{7,6,9}};
        int add [][]= new int[3][3];
        System.out.println("First matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]);  
            }
            System.out.println("");
          }
        System.out.println("Second matrix");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]);   
    }
            System.out.println("");
            
    
}
        System.out.println("Addition of two matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                add[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(add[i][j]+"");
       
    }
            System.out.println("");
}
    }
}