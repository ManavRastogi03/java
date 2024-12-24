package Univpaper;
class InvalidageException extends Exception{
    public InvalidageException(String s){
        super(s);
    }
}

public class UserDefineException {
    public static void main(String[] args) {
        int age = -12;
        try {

            if (age < 0) {
                throw new InvalidageException("Not Allowed");
            } else {
                System.out.println("Eligible");
            }
        }catch(InvalidageException e){
            System.out.println(e.getMessage());
        }

    }

}
