// Task_0
//Посчитайте сколько драгоценных камней в куче обычных камней
//Пример:
//jewels = “aB”, stones = “aaaAbbbB”
//Результат в консоль ”a3B1”
// public static void main(String[] args) {
// }
// public String findJewelsInStones(String jewels, String stones) {
//     return "";
// }


package HW;
    public class HW2_1 {  public static void main(String [] args){
        String jewels = "aB";
        String stones = "aaaAbbbB";
        System.out.println(countJewels(jewels, stones));
    }
    public static String countJewels(String jewels, String stones){ 
        int count = 0; 
        StringBuilder result = new StringBuilder(); 
        for(int i = 0; i < stones.length(); i++){ 
            if(jewels.indexOf(stones.charAt(i)) != -1){ 
                count++; 
            } 
        }
        for(int i = 0; i < jewels.length(); i++){ 
            int jewelCount = 0; 
            for(int j = 0; j < stones.length(); j++){ 
                if(jewels.charAt(i) == stones.charAt(j)){ 
                    jewelCount++; 
                } 
            } 
            if(jewelCount > 0){ 
                result.append(jewels.charAt(i)); 
                result.append(jewelCount); 
            } 
        } 
        return result.toString(); 

    } 

}            