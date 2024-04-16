public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] names = {"Bob", "Bobert", "Bobson", "Bobathan"};
        double[] scores = {87, 86, 92, 100};
        //System.out.println("Student: "+names[0]+". Score: "+scores[0]);

        //print arrays using for loop
        //define var that holds amt of items
        int size = names.length;

        for (int x = 0; x < size; ++x){
            System.out.println("Student: "+names[x]+"\n"+names[x]+"'s Score: "+scores[x]);
        }//ends for loop
    }
}