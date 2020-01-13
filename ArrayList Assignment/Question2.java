import java.util.ArrayList;

class Question2 {

    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        int index = nums.size()-1;
        
        int small = nums.get(nums.size()-1);
        for(int i = nums.size()-1; i > 0; i--) {
            int get = nums.get(i-1);
            if(get <= small) {
                small = get;
                index = (i-1);
            }
        }
        
        nums.remove(index);
    }
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }

        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }

}
