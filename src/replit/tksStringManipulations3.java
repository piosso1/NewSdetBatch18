package replit;

/*
Create method name it as newLine
2. Add print statement inside method body as "newLine method implementation"
3. Call newLine method three times
 */

public class tksStringManipulations3 {

    /*
    Create method name it as newLine
2. Add print statement inside method body as "newLine method implementation"
     */
    public void NewLine(){


        System.out.println("newLine method implementation");
    }

    public static void main(String[] args) {

        tksStringManipulations3 call = new tksStringManipulations3();
        for (int i = 0; i < 3; i++) {
            call.NewLine();
        }
    }
}
