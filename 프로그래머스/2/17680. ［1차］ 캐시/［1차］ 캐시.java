import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        int totalTime = 0;
        LinkedHashSet<String> cache = new LinkedHashSet<>(cacheSize);

        for (String city : cities) {
            city = city.toLowerCase();

            //값이 있을때
            if (cache.contains(city)) { 
                totalTime += 1;
                cache.remove(city); 
                cache.add(city);    
            } else { //값이 없을 때
                totalTime += 5;
                if (cache.size() >= cacheSize) {
                    Iterator<String> iterator = cache.iterator();
                    iterator.next();
                    iterator.remove();
                }
                cache.add(city); 
            }
        }

        return totalTime;
    }
}