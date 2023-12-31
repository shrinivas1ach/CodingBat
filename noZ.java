// Given a list of strings, return a list of the strings, omitting any string that contains a "z".
public List<String> noZ(List<String> strings) {
  strings.removeIf(s -> s.contains("z"));
  return strings;
}
