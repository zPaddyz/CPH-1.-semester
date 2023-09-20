// 7.a
ArrayList<Integer> myNumbers = new ArrayList<Integer>();

ArrayList<String> myStrings = new ArrayList<String>();


ArrayList<Boolean> myBooleans = new ArrayList<Boolean>();



void setup(){
  myNumbers.add(3);
  myNumbers.add(6);
  myNumbers.add(9);
  myStrings.add("Hej");
  myStrings.add("Med");
  myStrings.add("Dig");
  myBooleans.add(true);
  myBooleans.add(false);
  myBooleans.add(true);
  
  printAllString(myStrings);
  returnSum(myNumbers);
  getAverage(myNumbers);
}

void printAllString(ArrayList<String> textList){
  for(String text : textList){
   println(text); 
    
  }
  
}

int returnSum(ArrayList<Integer> numList){
  int sum = 0;
   for(int num : numList)
   {
    sum += num; 
   }
   println(sum);
  return sum;
}


int getAverage(ArrayList<Integer> numList){
  int sum = 0;
   for(int num : numList)
   {
    sum += num; 
   }
   println(sum/numList.size());
  return (sum/numList.size());
}
