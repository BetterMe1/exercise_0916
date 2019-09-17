package exercise.exercise_0916;

/**
 * @Description:快手笔试
 * @Author:Anan
 * @Date:2019/9/16
 */
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int max = 0;
        String result = "";
        int len = sb.length();
        String tmp;
        String tmp2;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<=len; j++){
                tmp = sb.substring(i,j);
                tmp2 = new StringBuilder(sb.substring(i,j)).reverse().toString();
                if(j-i>max && tmp2.equals(tmp)){
                    max = j-i;
                    result = tmp;
                }
            }
        }
        System.out.println(result);
    }
}
*/

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] p = sc.nextLine().split(",");
        int[][]nums = new int[p.length][2];
        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y1 = Integer.MAX_VALUE;
        int y2 = Integer.MIN_VALUE;
        for(int i=0; i<p.length; i++){
            nums[i][0] = Integer.parseInt(p[i].split(" ")[0]);
            nums[i][1] = Integer.parseInt(p[i].split(" ")[1]);
            if(nums[i][0] < x1){
                x1 = nums[i][0];
            }
            if(nums[i][0] > x2){
                x2 = nums[i][0];
            }
            if(nums[i][1] < y1){
                y1 = nums[i][1];
            }
            if(nums[i][1] > y2){
                y2 = nums[i][1];
            }
        }
        System.out.println(x1+" "+y1+","+x1+" "+y2+","+x2+" "+y2+","+x2+" "+y1);
    }
}
*/


/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] strs = sc.next().split(",");
        int[] nums = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                count++;
            }
            if(count == 2){
                break;
            }
        }
        System.out.println((count < 2 ? 1 : 0));
    }
}
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String str = temp.split(",")[0];
        int numRows = Integer.parseInt(temp.split(",")[1]);
        if(numRows == 1){
            System.out.println(str);
        }else{
            StringBuilder result = new StringBuilder();
            int ret = 2*numRows-2;
            int n = str.length();
            for(int i=0; i<numRows; i++){
                for(int j=0; j+i<n;j+=ret){
                    result.append(str.charAt(j+i));
                    if(i!=0 && i!=numRows-1 && j+ret-i<n){
                        result.append(str.charAt(j+ret-i));
                    }
                }
            }
            System.out.println(result.toString());
        }
    }
}

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String str = temp.split(",")[0];
        int n = Integer.parseInt(temp.split(",")[1]);
        StringBuilder result = new StringBuilder();
        if(n == 1){
            System.out.println(str);
        }else{
            int ret = 0;
            for(int j=0; j<n;j++){
                if(j!=n-1){
                    ret = 2*(n-j-1);
                }else{
                    ret = 2*j;
                }
                if(j==0 || j==n-1){
                    for(int i=j; i<str.length();i+=ret){
                        result.append(str.charAt(i));
                    }
                }else {
                    int i=j;
                    int flag = 0;
                    while (i<str.length()){
                        result.append(str.charAt(i));
                        if(flag == 0){
                            i+=ret;
                            flag = 1;
                        }else {
                            i += 2*j;
                            flag = 0;
                        }
                    }
                }
            }
            System.out.println(result.toString());
        }
    }
}
*/
