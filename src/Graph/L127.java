package Graph;

import java.util.*;

public class L127 {
  public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
    Set<String> dict = new HashSet<>();
    for (String s: wordList) dict.add(s);

    if (!dict.contains(endWord)) return 0;

    Queue<String> queue = new LinkedList<>();
    queue.offer(beginWord);
    int length = 0;

    while (!queue.isEmpty()) {
      int size = queue.size();
      length++;
      for (int s = 0; s < size; s++) {
        char[] head = queue.poll().toCharArray();
        for (int i = 0; i < head.length; i++) {
          char ch = head[i];
          for (char c = 'a'; c <= 'z'; c++) {
            if (c == ch) continue;
            head[i] = c;
            String temp = new String(head);
            if (temp.equals(endWord)) return length + 1;
            if (!dict.contains(temp)) continue;
            dict.remove(temp);
            queue.offer(temp);
          }
          head[i] = ch;
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    List<String> l = new ArrayList<>();
    l.add("hot");
    l.add("dot");
    l.add("dog");
    l.add("lot");
    l.add("log");
    l.add("cog");
    ladderLength("hit", "cog", l);
  }
}
