package firstDay;
//Arrays in Java are also objects.
//They need to be declared and then created.
//Java arrays are 0 based,
public class Arrays {
    public static void main(String[] args) {
//array of integers
        int[]arr;
        //once we create we put the size we want
        //hoii! 23 is my fav number hhh
        arr =new int[23];
        //function on the arrays
        System.out.println(arr.length);

        arr[0]=100;
        arr[1]=arr[0]+100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

//another nethode to create an array
        int[] arr1={1,2,3,4,5};
        System.out.println(arr1.length);
        //print the array adress
        System.out.println(arr1);
        //print the arrays content
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr[i]);
        }



    }
}
