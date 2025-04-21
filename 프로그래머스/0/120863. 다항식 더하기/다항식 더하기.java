class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        int xCount = 0;
        int constant = 0;

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    xCount += 1;
                } else {
                    xCount += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                // 상수항
                constant += Integer.parseInt(term);
            }
        }

        // 결과 조합
        StringBuilder sb = new StringBuilder();
        if (xCount > 0) {
            if (xCount == 1) {
                sb.append("x");
            } else {
                sb.append(xCount).append("x");
            }
        }
        if (constant > 0) {
            if (xCount > 0) {
                sb.append(" + ");
            }
            sb.append(constant);
        }

        return sb.toString();
    }
}
