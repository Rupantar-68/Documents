public class arraymaxminstatic {
    public static void main(String[] args) {

        int max, min, i;
        int[] Array = {1, 2, 3, 4, 5};

        max = min = Array[0];

        for (i = 1; i < Array.length; i++) {
            if (Array[i] > max)
                max =Array[i];
            else if (Array[i] < min)
                min =Array[i];

        }

        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);
    }
}
