class Solution {
    public static void fillLinkedList(LinkedList<Integer> ll, int k) {

        LinkedList<Integer> result = new LinkedList<>();

        for (int i = 0; i < ll.size(); i++) {
            result.add(k);
        }

        ll.clear();
        ll.addAll(result);
    }
}
