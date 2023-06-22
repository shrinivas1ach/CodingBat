// Given a list of strings, return a list where each string has all its "x" removed. 
public List<String> noX(List<String> nums) {
  nums.replaceAll(n -> n.replaceAll("x", ""));
  return nums;
}
