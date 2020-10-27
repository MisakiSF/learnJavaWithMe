package firstDay;
/*
not all te types in java are objects, it builts based on primitives
byte,short,int(4bytes),long(8bytes),float(4bytes),double(8bytes),char(2byte),boolean(true or fqlse)

java is strong typed language that means all variables must be defined before we use them
*/
public class variableAndTypes {
    public static void main(String[] args) {
        Byte zero=0;
        int e=3,l=1;
        char esp=' ';
        double f=2.0f;
        boolean t=true;
        String somme="H"+e+l+l+zero+esp+"w"+zero+"r"+l+"d"+esp+f+t;

        System.out.println(somme);
    }
}
