/*
 * 프로그래머스 코딩테스트 연습 level 1 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 
 * 
 * 다른 모범답안에 사용된 api
 * HashMap : 나중에 공부해볼것
 */



package marathon;

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Arrays.sort(completion);
        Arrays.sort(participant);
        
        int i = 0;
        
        for (i = 0 ; i<completion.length ; i++) { //i++ 은 마지막 length 전까지 도달 하고 ++하기 때문에 length와 같은 값을 가진다.
        	if (!completion[i].equals(participant[i])) {
        		return participant[i];
        	}
        }
        return participant[i];
    }
}
public class Marathon {
	public static void main(String[] args) {
		Solution s1 = new Solution();
		System.out.println(s1.solution(new String[] {"1", "2", "3"}, new String[]{"1", "2"} ));
		Solution[] p = new Solution[3];
		p[0] = new Solution();
		p[1] = new Solution();
		p[2] = new Solution();
		System.out.println(p[0].solution(new String[]{"leo", "kiki", "eden"}, 
				new String[]{"eden", "kiki"}));
		System.out.println(p[1].solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, 
				new String[]{"josipa", "filipa", "marina", "nikola"}));
		System.out.println(p[2].solution(new String[] {"mislav", "stanko", "mislav", "ana"}, 
				new String[] {"stanko", "ana", "mislav"}));
	}
}
