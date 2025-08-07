public class p1_4 {
    public static void main(String[] args) {

        // if (args.length != 2) {
        //     System.out.println("Usage: java SpeedCalculator <distance> <time>");
        //     return;
        // }

        double distance = Double.parseDouble(args[0]);
        double time = Double.parseDouble(args[1]);


        // if (time == 0) {
        //     System.out.println("Time cannot be zero.");
        //     return;
        // }

       
        double speed = distance / time;


        System.out.println("Speed = " + speed + " units/time");


        // part: 2 simple interest

        //Note : Also applay certain consition..

        double P_ammount  =Double.parseDouble(args[0]);
        double R_ammount =Double.parseDouble(args[1]);
        double Time =Double.parseDouble(args[2]);

        double Simple_ammount =(P_ammount*R_ammount*Time)/100;
        System.out.println("Simle_amount is"+Simple_ammount);

        // part: 3 Volume of Cylinder..

        float PI=Float.parseFloat(args[0]);
        double  Radius =Double.parseDouble(args[1]);
        double  Height  =Double.parseDouble(args[2]);

        double Voulme_Cylinder =PI*Radius*Radius*Height;

        System.out.println("Volume_of_Cylinder"+Voulme_Cylinder);

    }
}
