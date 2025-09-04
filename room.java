public class room {
    public static void main(String[] args) {
        try{
        int a = 10;
        int b =0 ;
        int c = a/b;
        System.out.println(c);
        int arr[] = new int[5] ;
        arr[6] = 10;
        System.out.println(arr[0]);
        
    }
    catch(ArithmeticException e) {
        System.out.println("Error occured");
    }
    catch(ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
    }
    finally{
        System.out.println("End of program");
    }
}
}
