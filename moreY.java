// Given a list of strings, return a list where each string has "y" added at its start and end.
public List<String> moreY(List<String> nums) {
  nums.replaceAll(n -> "y"+n+"y");
  return nums;
}
