int a = 4;
int b = 6;

int min = 5;
int max = 6;

int x = 9;
int y = 2;
int z = 19;


if(a == 10 || b == 10 || a + b == 10){
  println("Success!");
} else {
  println("Failure!");
}

if(min + max > 10){
 if(min <= 5 ||  max <= 5) {
   println("Success!");
 }
}


if(x+y+z == 30){
 if((x == 10 || y == 10 || z == 10) || 
 (x == 20 || y == 20 || z == 20) || 
 (x == 30 || y == 30 || z == 30))
 {
   println("Failure!");
 } else {
   println("Success!");
 }
} else println("Failure!");
