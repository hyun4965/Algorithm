class Solution {
    public String[] solution(String[] picture, int k) {
        java.util.ArrayList<String> result = new java.util.ArrayList<>();

        for (String line : picture) {
            StringBuilder enlargedLine = new StringBuilder();
            for (char c : line.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    enlargedLine.append(c);
                }
            }

            String expanded = enlargedLine.toString();
            for (int i = 0; i < k; i++) {
                result.add(expanded);
            }
        }

        return result.toArray(new String[0]);
    }
}
