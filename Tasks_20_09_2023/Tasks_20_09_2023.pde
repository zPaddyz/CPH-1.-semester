int[] arr = { 28, 230, 9, 310,72};

int getRandom(){
  int random = arr[int(random(0,4))];
  
  return random;
}

void setup(){
  println(getRandom());
}
