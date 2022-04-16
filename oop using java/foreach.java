public class foreach {
    public static void main(String[] args){
        String[] cars={"volvo","bmw","ford"};
        for(String i:cars){
            System.out.println(i);
        }
        System.out.println("\n");
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
