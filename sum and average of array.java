import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter"+n+"array elements: ");
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            sum = sum+arr[i];
            
        }
        double average = sum/n;
        System.out.println("sum of array elements="+sum);
        System.out.println("avg="+average);
        sc.close();
        
        
}
}
