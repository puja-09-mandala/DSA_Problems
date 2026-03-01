class MyHashMap {
HashMap<Integer,Integer>hp=new HashMap<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        hp.put(key,value);
    }
    
    public int get(int key) {
        if(hp.containsKey(key))
        {
            return hp.get(key);
        }
        return -1;
    }
    
    public void remove(int key) {
        hp.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */