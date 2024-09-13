// you can also use imports, for example:
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

class Solution {
  public int solution(String S) {
    String[] sItemArray = S.split("");
    Set<String> prefixSet = new HashSet<>();
    Set<String> suffixSet = new HashSet<>();

    // Generating prefix set
    Arrays.stream(sItemArray)
        .reduce("", (prev, curr) -> {
          prefixSet.add(prev);
          return prev + curr;
        });

    // Generating suffix set
    List<String> reversS = Arrays.asList(sItemArray);
    Collections.reverse(reversS);

    reversS.stream()
        .reduce("", (prev, curr) -> {
          suffixSet.add(prev);
          return curr + prev;
        });

    Set<String> commonItems = new HashSet<>(prefixSet);
    commonItems.retainAll(suffixSet);

    String maxLenS = commonItems.stream()
        .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())) // Sort by length descending
        .findFirst().get();

    return Optional.ofNullable(maxLenS).map(String::length).orElse(0);
  }
}
