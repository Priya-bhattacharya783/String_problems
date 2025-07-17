import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n <= 0) {
            return;
        }

        String[] strs = new String[n];
        
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<String>());
            }

            List<String> anagramGroup = map.get(sorted);
            anagramGroup.add(word);
        }

        for (List<String> group : map.values()) {
            for (String word : group) {
                System.out.print(word + " ");
            }
        }
    }
}
