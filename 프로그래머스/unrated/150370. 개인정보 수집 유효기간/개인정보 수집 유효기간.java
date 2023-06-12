import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int d, m, y, temp, pd, pm, py;
        int todayInt;
        String[] privac;
        int priDate;
        String[] term;
        ArrayList<Integer> deleteList = new ArrayList <Integer>();
        HashMap <String, Integer> termMap = new HashMap<String, Integer>();
        
        for(int i = 0; i < terms.length; i++){
            term = terms[i].split(" ");
            termMap.put(term[0], Integer.parseInt(term[1]));
        }
        
        todayInt = Integer.parseInt(today.replace(".",""));
        d = todayInt%100;
        temp = todayInt/100;
        m = temp%100;
        y = temp/100;
        
        for(int i = 0; i < privacies.length; i++){
            privac = privacies[i].split(" ");
            priDate = Integer.parseInt(privac[0].replace(".",""));
            pd = priDate%100;
            temp = priDate/100;
            pm = temp%100;
            py = temp/100;
            pm = pm + termMap.get(privac[1]);
            if(pm > 12){
                py = py + pm/12;
                if(pm%12 == 0){
                    pm = 12;
                    py--;
                }else{
                   pm = pm%12; 
                }
            }
            if(pd == 1){
                pd = 28;
                pm--;
                if(pm == 0){
                    pm =12;
                    py--;
                }
            } else{
                pd--;
            }
            System.out.println(py + "." + pm + "." + pd);
            System.out.println(y + "." + m + "." + d);
            if(y > py){
                deleteList.add(i+1);
            } else if(y == py){
                if(m > pm){
                    deleteList.add(i+1);
                } else if(m == pm){
                    if(d > pd){
                        deleteList.add(i+1);
                    }
                }
            }
        }
        int []answer = new int[deleteList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = deleteList.get(i);
        }
        return answer;
    }
}