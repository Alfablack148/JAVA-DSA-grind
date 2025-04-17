public class binarySearch {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;

        int lowerCase = 0;
        int UperCase = nums.length-1;
        int mid = 0;
        int flag = 0;
         while(lowerCase <= UperCase){
             mid = (lowerCase + UperCase)/2;
             if(nums[mid] == target){
                 flag = 1;
                 break;
             }if(nums[mid] < target){
                 lowerCase = mid+1;
             }if(nums[mid] > target){
                 UperCase = mid-1;
             }
         }
         if(flag == 1){
            System.out.print("key is found = " + nums[mid]);
         }else{
            System.out.print("key is Not found = " + nums[mid]);
         }
    }
}
