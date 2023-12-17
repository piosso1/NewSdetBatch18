package HomeWork;

public class tksArray1 {
    public static void main(String[] args) {
/*Create an array of names and store all names of your group.
Then print your name from that array. (use 2 different ways of creating an array).
 */

        String [] names={"Buket","Umar","Glizar","Milan","Sedef","Melisa","Beckonson","Kawoon","Muhammad","Patrick","Yinka"};

        System.out.println(names[9]);


        String [] names2 = new String[11];
        names2[0] = "Buket";
        names2[1] = "Umar";
        names2[2] = "Glizar";
        names2[3] = "Milan";
        names2[4] = "Sedef";
        names2[5] = "Melisa";
        names2[6] = "Beckonson";
        names2[7] = "Kawoon";
        names2[8] = "Muhammad";
        names2[9] = "Patrick";
        names2[10] = "Yinka";

        System.out.println(names2[9]);

    }


}
