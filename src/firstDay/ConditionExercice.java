package firstDay;
/*Change the variables in the first section, so that each if statement resolves as true.*/
public class ConditionExercice {
    public static void main(String[] args) {
        //String a = new String("Wow");
        //String b = "Wow";
        //String c = a;
        //String d = c;
        /*****changements****/
        String a = "Wow";
        String b = "Wow";
        String c = b+"!";
        String d = c;

        boolean b1 = b == a;
        System.out.println(b1);

        boolean b2 = d.equals(b + "!");
        System.out.println(b2);
        // !a means non a
        boolean b3 = !c.equals(a);
        System.out.println(b3);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
}}
