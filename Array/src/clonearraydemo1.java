
public class clonearraydemo1 {
    public static void main(String[] args) {
    int arr1[][]={{1,2,3,4,5},{2,4,6,8,9}};
    int arr2[][]=  arr1.clone();
 
        for(int i=0;i<arr1.length;i++){
            for(int j=0;i<arr1.length;j++){
            System.out.print(arr1[i][j]+" ");
        }
        }
        
        System.out.println(" ");
     
        for(int i=0;i<arr2.length;i++){
            for(int j=0;i<arr2.length;j++){
        System.out.print(arr2[i][j]+" ");
        }
        }
        
        System.out.println(arr1==arr2);
        System.out.println(arr1!=arr2);
        System.out.println(arr1==arr1);
        System.out.println(arr2==arr2);
        
        
    }
    
    
}

    

