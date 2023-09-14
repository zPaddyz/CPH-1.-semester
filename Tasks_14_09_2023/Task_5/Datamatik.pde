void setup(){
  teacher teacher1 = new teacher("Tina" , 42, true);
  student student1 = new student("Patrick Andersen", 28, false, "Hold a");
  student student2 = new student("Lille Mads", 9, false, "Hold a");
  
  
  println(teacher1.name);
  
  println(student1.name + " is from team: " + student1.datamatikerTeam);
  println(student2.name + " is from team: " + student2.datamatikerTeam);
  
  
  if(isClassMates(student1, student2)){
    println(student1.name + " and " + student2.name + " Are class mates");
  } else 
  println(student1.name + " and " + student2.name + " Are not class mates");
}

boolean isClassMates(student s1, student s2){
  if(s1.datamatikerTeam == s2.datamatikerTeam)
  {
    return true;
  } else return false;
}
