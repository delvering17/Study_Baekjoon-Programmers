import java.util.function.BiPredicate;

class Solution {
    BiPredicate<Integer, Integer> lt = (n, m) -> n < m;
    BiPredicate<Integer, Integer> loe = (n, m) -> n <= m;
    BiPredicate<Integer, Integer> gt = (n, m) -> n > m;
    BiPredicate<Integer, Integer> goe = (n, m) -> n >= m;

    public int solution(String ineq, String eq, int n, int m) {
        BiPredicate<Integer, Integer> predicate = getPredicateByCondition(ineq, eq);
        
        return predicate.test(n, m) ? 1 : 0;
    }

    public BiPredicate<Integer, Integer> getPredicateByCondition(String ineq, String eq) {
        String condition = ineq + eq;
        
        if (condition.equals("<=")) {
            return loe;
        } else if (condition.equals("<!")) {
            return lt;
        } else if (condition.equals(">=")) {
            return goe;
        } else if (condition.equals(">!")) {
            return gt;
        } else {
            throw new RuntimeException("ineq, eq 맞지 않음");
        }
    }

}