public class Main{

    public static void main(String[] args){

        /*
        Given an integer array nums, 
        return true if any value appears at least twice in the array, 
        and return false if every element is distinct.
        */
        String[] num = {"1", "2", "3", "1"};
        boolean ChecoIfMatching = false;
        
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i].equals(num[j])) {
                    ChecoIfMatching = true;
                    break; 
                }
            }
            if (ChecoIfMatching) break;
        }
        
        System.out.println("Duplicate found: " + ChecoIfMatching);




    }

}