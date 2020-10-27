package firstDay;

/*
java uses boolean variables to evaluate conditions

+++++++++
if (a == b) {
    // We already know this part
} else {
    // a and b are not equal... :/
}
+++++++++
pay attention while yur using objects
* */
public class Conditionals {
     public static void main(String[] args) {
        int a=1;
        int b=2;
        if(a==b){
            System.out.println("same");
        }
        else {
            System.out.println("noo!");
        }
     System.out.println("#########");
        String c=new String("hai");
        String d=new String("hai");
        String sameC=c;
        // This is false, since c and d are not the same object
        boolean r1=c==d;
         // This is true, since c and sameC are really the same object
        boolean r3=sameC==c;
        // This is true, since c and d are logically equals
        boolean r2=c.equals(d);
         System.out.println(r1);
         System.out.println(r3);
         System.out.println(r2);
    }
}
