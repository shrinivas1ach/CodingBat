// Given a list of non-negative integers, return an integer list of the rightmost digits.
public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(n -> n%10);
  return nums;
}
