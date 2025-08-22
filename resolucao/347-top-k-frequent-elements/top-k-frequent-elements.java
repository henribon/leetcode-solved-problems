import java.util.HashMap;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] arr = new int[k];

        for(int i = 0; i < nums.length; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> lista = new ArrayList<>(hash.entrySet());
        Collections.sort(lista, (a, b) -> b.getValue() - a.getValue());

        for(int i=0; i < k; i++) {
            int numero = lista.get(i).getKey();
            arr[i] = numero;
        }
        return arr;
    }
}