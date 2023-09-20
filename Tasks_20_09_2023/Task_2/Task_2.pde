// 2a 
String printPartOfWord(String text, int startOfCut, int lengthOfCut){
  String tempString = text.substring(startOfCut, startOfCut+lengthOfCut);
  
  return tempString;
}

// 2b
void setup(){
  println(printPartOfWord("København er for nice manner!", 1, 11));
}
