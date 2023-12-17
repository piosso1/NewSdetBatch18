package personalHomeWork;

/*
Write program: User that has a constructor that initializes instance
variable name and mobile number. Create a subclass/child class
userInfo that will have user address variable and it also being initialized
through constructor call. Print users name, mobile number and address in
userDetails method. Test your code.
 */

public class user {

    private String name;
    private String mobil;


    public user(String name, String mobil) {
        this.name = name;
        this.mobil = mobil;
    }

    public String getName(){
        return name;
    }


    public void printInfo() {
        System.out.println(name+" "+mobil);
    }
}
class userInfo extends user{
    private String address;
    public userInfo(String name, String mobil, String address) {
            super(name, mobil);
            this.address = address;
        }
        public void printDetails(){
            System.out.println(address);
        }

        public void printInfo(){
            super.printInfo();
            System.out.println(address);
        }

    }

class userTester{
    public static void main(String[] args) {
        userInfo detail = new userInfo("patrick","07068660122","uyo/Nigeria");
        detail.printInfo();
    }
}
