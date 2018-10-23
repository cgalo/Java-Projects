public class FastestRunner {
    public static void main(String[] args) {

        final int numRunners = 16;

        String names[] = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil",
                "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel",
                "Neda", "Aaron", "Kate" };

        int times[] = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
                393, 299, 343, 317, 265 };


        String fastestRunner = "";
        String secondRunner  = "";
        int fastest_time = 0;
        int second_time  = -1;

        for (int i = 0; i < numRunners; i++) {

            //Check if faster than second runner
            if ( times[i] > second_time ){

                //If faster than second runner then save as fastest runner
                if (times[i] > fastest_time){

                    fastest_time  = times [ i ];
                    fastestRunner = names [ i ];
                }
                //Else save the runner as second fastest runner
                else {
                    second_time  = times [ i ];
                    secondRunner = names [ i ];
                }
            }
            System.out.println(names[i] + ": " + times[i]);

        }
        System.out.println( "\nFastest Runner: " + fastestRunner + "\nWith time of (min): " + fastest_time);
        System.out.println( "Second fastest runner is: " + secondRunner + "\nWith time of (min): " + second_time);
    }
}
