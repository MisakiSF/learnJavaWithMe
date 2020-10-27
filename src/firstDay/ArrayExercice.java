package firstDay;
//Change the values in numbers so it will not raise an error.
public class ArrayExercice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        //int length = numbers[3];
        //arr[last] => lenght
        int length = numbers[2];
        System.out.println(length);
        char[] chars = new char[length];
        //chars[numbers.length+4] = 'y'; we must accept the length of the array
        chars[numbers.length-1] = 'y';
        // or chars[numbers.length-2] = 'y';
        System.out.println("Done!");



    }
}
