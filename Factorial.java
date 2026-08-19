class Solution {
    int factorial(int n) {
        // code here
        int temp = n;
        int fact = 1;
        while(temp!=0){
            fact = fact*temp;
            temp--;
        }
        return fact;
    }
}
