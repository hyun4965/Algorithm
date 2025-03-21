class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            StringBuilder filtered = new StringBuilder();

            for (char ch : tree.toCharArray()) {
                if (skill.contains(String.valueOf(ch))) {
                    filtered.append(ch);
                }
            }
            if (skill.startsWith(filtered.toString())) {
                answer++;
            }
        }

        return answer;
    }
}
