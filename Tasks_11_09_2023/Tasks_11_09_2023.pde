int add(int a, int b){
  return a+b;
}

int subtract(int a, int b){
  return a-b;
}

int multiply(int a, int b){
  return a*b;
  
}

int divide(int a, int b){
  return a/b;
}

int getMin(int a, int b, int c){
  int temp = 0;
  if(a < b) temp = a;
  else temp = b;
  
  if(temp > c) temp = c;
  
  return temp;
}

int getAverage(int a, int b, int c){
  return (a+b+c)/3;
}



char getLowestChar(String x){
  int temp = 100000;
  for(int i = 0; i < x.length(); i++){
    if(temp > x.charAt(i)) temp = x.charAt(i);
  }
  
  return char(temp);
}


int getVocals(String vocalsToGet){
  int counter = 0;
  for(int i = 0; i < vocalsToGet.length(); i++){
    switch(vocalsToGet.charAt(i)){
      case 'a':
      case 'e':
      case 'y':
      case 'u':
      case 'i':
      case 'o':
      case 'æ':
      case 'ø':
      case 'å':
        counter++;
        break;
      
    }
  }
  
  return counter;
}


boolean isPalindrom(String Text){
  
  String tempText = "";
  for(int i = Text.length()-1; i >= 0; i--){
    tempText += Text.charAt(i);
  }
  
  if(Text.equals(tempText)) return true; 
  else return false;
}

void setup(){
  println(getMin(10,2,322));
  
  
  println(getLowestChar("sdrgdsrgsddfadfvljrdhsefskheflhsef"));
  
  
  println(getVocals("Hej med dig din lækre mand"));
  
  
  
  println(isPalindrom("hannah"));
}
