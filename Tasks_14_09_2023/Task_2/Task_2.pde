boolean happy = true;

 void setup() {
   println(sum(1,2) +"");
   
   println(Uppercase("tadaaaaa"));
   
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
   
   
   
}

boolean iAmHappy(){
  // fill out what is missing here: 
  return happy;
}


int sum(int n1, int n2){
    return n1 +n2;
  
  
}

String Uppercase(String textToConvert){
  return textToConvert.toUpperCase();
}

/*
boolean CheckIfUpper(String textToCheck)
{
  if(textToCheck.isUpperCase(textToCheck.charAt(0)))
  {
    return true;
  } else return false;
  
}*/
