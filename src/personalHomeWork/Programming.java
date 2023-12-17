package personalHomeWork;

/*
Create a class named 'Programming'. While creating an object of the class,
if nothing is passed to it, then the message "I love programming languages" should be printed.
If some String is passed to it, then in place of "programming languages" the value variable should be printed.
Example, if we pass "Java", then "I love Java" should be printed
 */
public class Programming {

    private String language;

    public Programming(){
        this.language = "programming languages";
        System.out.println("I love "+language);
    }

    public Programming(String language){
        this.language = language;
        System.out.println("I love "+language);
    }

    public static void main(String[] args) {
        Programming prog1 = new Programming();
        Programming prog2 = new Programming("Java");
    }
}
