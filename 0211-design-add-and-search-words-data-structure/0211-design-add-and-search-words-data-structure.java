class WordDictionary {
    List<String>ans=new ArrayList<>();
    public WordDictionary() {
        
    }
    public void addWord(String word) {
        ans.add(word);
    }
    boolean isMatch(String word, String pattern) {
    if (word.length() != pattern.length()) {
        return false;
    }
    for (int i = 0; i < word.length(); i++) {
        char p = pattern.charAt(i);
        char w = word.charAt(i);
        if (p == '.') {
            continue; 
        }
        if (p != w) {
            return false; 
        }
    }
    return true;
}
    public boolean search(String word) {
       for (String wo : ans) {
    if (isMatch(wo, word)) {
        return true;
    }
}
return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */