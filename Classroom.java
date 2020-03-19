public class Classroom {


    public static void main(String[] args) {
        
        Wilder henri = new Wilder("Henri", true);
        Wilder marie = new Wilder("Marie", true);
        Wilder jacques = new Wilder("Jacques", false);
        Wilder louise = new Wilder("Louise", false);

        System.out.println(henri.whoAmI());
        System.out.println(marie.whoAmI());
        System.out.println(jacques.whoAmI());
        System.out.println(louise.whoAmI());
        
    }
}