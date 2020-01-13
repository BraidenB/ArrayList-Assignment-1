import java.util.ArrayList;

class Question3 {

    public static void removeConsecutives(ArrayList<Integer> nums) {
        //This method removes consecutive duplicate values from the 
        //list nums.  Hint: loop backwards through the list
        
        for(int i = nums.size()-1; i > 0; i--) {
            int next = nums.get(i-1);
            int current = nums.get(i);
            if(current == next) {
                nums.remove(current);
            }
        }
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(1);
        System.out.println("Our list before: " + nums);
        removeConsecutives(nums); 
        System.out.println("Our list after:  " + nums);
        //should output [1,2,3,1]
    }

    
}