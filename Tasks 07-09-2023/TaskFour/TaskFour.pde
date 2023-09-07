int start = 20;

int counter = 0;
int counter2 = 20;
//4.a
for(int i = 0; i <= 20; i++){
  
  println(i);
  
}
println();

// 4.b
for(int i = 0; i <= 20; i++){
  if(i%2==0){
  println(i);
  }
}

println();
//4.c + 4.d
for(int i = start; i >= 0; i--){
  if(i == 3){
    println("Three");
  } else if(i == 2){
    println("Two");
  } else if(i == 1){
    println("One"); 
  } else println(i);
}

println();
//4.e
while(counter <= 20){
  if(counter % 2 == 0) println(counter);
  counter++;
}

println();
while(counter2 >= 0){
  println(counter2);
  counter2--;
}
