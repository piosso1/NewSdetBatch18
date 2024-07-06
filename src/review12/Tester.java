package review12;

public class Tester {
    public static void main(String[] args) throws BrainNotFound {

        BrainNotFound brainNotFound=new BrainNotFound("Please make sure You have your brain");
        throw  brainNotFound;
    }
}
