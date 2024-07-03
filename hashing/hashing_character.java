import java.util.*;

public class hashing_character {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine(); // let s = "divyansh"
        int[] hash = new int[128];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;    //i=0 --> s.charAt(0) = 'd' which directly typecasted into 'd' (ASCII value 100) --> hash[100] --> incremented from 0 to 1;
                                   // i=1 --> s.charAt(1) = 'i' which directly typecasted into 'i' (ASCII value 105) --> hash[105] --> incremented from 0 to 1;
                                   // i=2 --> s.charAt(2) = 'v' which directly typecasted into 'v' (ASCII value 118) --> hash[118] --> incremented from 0 to 1;
                                   // i=3 --> s.charAt(3) = 'y' which directly typecasted into 'y' (ASCII value 121) --> hash[121] --> incremented from 0 to 1;
                                   // i=4 --> s.charAt(4) = 'a' which directly typecasted into 'a' (ASCII value 97) --> hash[97] --> incremented from 0 to 1;
                                   // i=5 --> s.charAt(5) = 'n' which directly typecasted into 'n' (ASCII value 110) --> hash[110] --> incremented from 0 to 1;
                                   // i=6 --> s.charAt(6) = 's' which directly typecasted into 's' (ASCII value 115) --> hash[115] --> incremented from 0 to 1;
                                   // i=7 --> s.charAt(7) = 'h' which directly typecasted into 'h' (ASCII value 104) --> hash[104] --> incremented from 0 to 1;
        }

        int q = sc.nextInt();     // let q = 4
        sc.nextLine(); // Consume the newline character

        while (q-- > 0) {
            char c = sc.next().charAt(0); // read a single character // let c = 'a', 't', 'y', 'u'
            System.out.println(hash[c]);       // hash['a'] --> hash[97] --> 1
                                              // hash['t'] --> hash[116] --> 0
                                              // hash['y'] --> hash[121] --> 1
                                              // hash['u'] --> hash[117] --> 0
        }

        sc.close();
    }
}
