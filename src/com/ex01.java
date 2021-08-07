package com;

public class ex01 {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] your_input = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] result = s1.solution(your_input, win_nums);

        for (int a :result){
            System.out.println(a);
        }
    }
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int min = 0;
        int zero_count = 0;

        // lottos : 입력
        // win_nums : 당첨번호

        for (int input_num : lottos) {

            if(input_num == 0){
                zero_count++;
            }

            for(int i=0; i<(win_nums.length); i++) {
                if(win_nums[i] == input_num){
                    min++;
                }
            }
        }

        int min_grade = 0;
        int max_grade = 0;

        if(min ==  6){
            min_grade = 1;
        }
        else if(min == 5){
            min_grade = 2;
        }
        else if(min == 4){
            min_grade = 3;
        }
        else if(min == 3){
            min_grade = 4;
        }
        else if(min == 2){
            min_grade = 5;
        }else{
            min_grade = 6;
        }

        max_grade = min_grade - zero_count;

        if(max_grade < 0){
            max_grade = 1;
        }

        int[] answer = {max_grade, min_grade};
        //retrun은 최대값, 최소당첨.
        return answer;
    }
}
