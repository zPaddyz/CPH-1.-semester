void setup(){
  teacher teacher1 = new teacher("Tina" , 42, true);
  student student1 = new student("Patrick Andersen", 28, false, "Hold A");
  student student2 = new student("Lille Mads", 9, false, "Hold a");
  
  
  println(teacher1.name);
  
  teacher1.changeName("Ulla");
  
  
  println(teacher1.name);
  println(student1.name + " is from team: " + student1.datamatikerTeam);
  println(student2.name + " is from team: " + student2.datamatikerTeam);
}
