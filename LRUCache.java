// Problem : https://leetcode.com/problems/lru-cache/
class ListNode {
    int key;
    int value;
    ListNode next;
    ListNode prev;
    ListNode(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    int capacity;
    Map<Integer, ListNode> map;
    ListNode tail; // permanent;
    ListNode head; // permanent;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        tail = new ListNode(-1, -1);
        head = new ListNode(-1, -1);
        tail.next = head;
        head.prev = tail;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        ListNode node = map.get(key);
        removeNode(node);
        addNode(node);
        return map.get(key).value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)){
            ListNode oldNode = map.get(key);
            removeNode(oldNode);
            map.remove(key);
        }

        if (map.size() >= capacity){
            ListNode node = head.prev;
            removeNode(node);
            map.remove(node.key);
        }

        ListNode node = new ListNode(key, value);
        addNode(node);
        map.put(key, node);
    }

    public void removeNode(ListNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addNode(ListNode node){
        ListNode prevTail = tail.next;
        tail.next = node;
        node.prev = tail;
        node.next = prevTail;
        prevTail.prev = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
