public class p1_5 {

    //(a) On a single Line
    //(b) on separate  line
    public static void main(String[] args) {
        double Roll_Number =Double.parseDouble(args[0]);
        String Name =args[1];
        String Course =args[2];
        int Semester =Integer.parseInt(args[3]);

        System.out.println("Roll_Number is:"+Roll_Number);
        System.out.println("Name is: "+Name);
        System.out.println("Enroll Course is: "+Course);
        System.out.println("Your semester is:"+Semester);

    }
}
