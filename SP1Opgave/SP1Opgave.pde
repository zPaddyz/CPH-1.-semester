int counter = 0;
int time;
boolean hasWon = false;

ArrayList<Character> charArray = new ArrayList<Character>();
ArrayList<String> highscoresArray = new ArrayList<String>();
FileHandler fileHandler = new FileHandler();

char randomKey = 'a';

void setup() {
  size(1280, 720);
  generateNewRandomKey();
  time = millis()/1000;
}

void draw() {
  if (!hasWon) {

    time = millis()/1000;

    background(204, 255, 255);

    textSize(128);
    fill(0, 0, 0);
    text(time, 1150, 100);

    fill(50, 255, 50);
    rect(0, 700, width, 700);

    fill(255, 255, 255);
    drawHouse(700, 150);

    line(0, 700, width, 700);   // Ground

    drawFlag();

    fill(0, 0, 0);
    text(randomKey, 50, 100);
  } else
  {
  }
}
void keyPressed() {
  if (hasWon)
  {
    return;
  }
  if (key == randomKey)
  {
    charArray.add(randomKey);
    counter = counter + 10;
    if (counter >= 500)
    {
      //you win
      counter = 500;
      hasWon = true;
      textSize(55);

      //text("You won! Your characters were: \n"+ charArray.toString().substring(1, 30) +"\n " + charArray.toString().substring(30, charArray.size()) + "\n You finished in " + time + " Seconds!", 300, 50);


      // SKAl FIXES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      // ændre til string og loop igennem og derved add til arraylist?
      /*fileHandler.createFile();
      highscoresArray = fileHandler.readFromFile();
    
      if (highscoresArray.size() > 0) {
        for (int i = 0; i < highscoresArray.size(); i++) {
          if (Integer.parseInt(highscoresArray.get(i).replace(" ","")) > time) {
            if (i==0) {
              highscoresArray.add(0, time + "");
              break;
            } else {
              highscoresArray.add(i, time + "");
              break;
            }
          } else if (i == highscoresArray.size()) highscoresArray.add(time + "");
        }
      } else highscoresArray.add(time + "");
      //TODO: insert highscore in the correct spot!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      //highscoresArray.add(time + "");

      String stringToSave = highscoresArray.toString();
      stringToSave = stringToSave.replace('[', ' ');
      stringToSave = stringToSave.replace(']', ' ');
      fileHandler.writeToFile(stringToSave);*/
    }
    // SKAl FIXES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    
    generateNewRandomKey();
  } else if (keyCode == SHIFT || keyCode == CONTROL || keyCode == ALT) {
  } else {
    counter = counter - 4;
    if (counter <= 0) counter = 0;
  }
}

void generateNewRandomKey() {
  randomKey = (char)random(32, 125);
  if (randomKey == ((char)94) || randomKey == ((char)96) || randomKey == ((char)124))
  {
    generateNewRandomKey();
  }
}


void drawFlag() {
  rect(400, 100, 20, 700);
  fill(255, 0, 0);
  rect(400, 600-counter, 200, 100, 10);
  fill(255, 255, 255);
  rect(400, 635-counter, 200, 25, 10);
  rect(470, 600-counter, 25, 100, 10);
}

void drawHouse(int xPos, int yPos)
{
  fill(255, 255, 102);
  rect(50+xPos, 200+yPos, 500, 350);   // outside border of house
  fill(51, 26, 0);
  triangle(50+xPos, 200+yPos, 300+xPos, 50+yPos, 550+xPos, 200+yPos);   // roof

  fill(230, 255, 255);
  rect(85+xPos, 250+yPos, 100, 225);   // outside of left window
  line(85+xPos, 363+yPos, 185+xPos, 363+yPos);   // horizontal line in left window
  line(135+xPos, 250+yPos, 135+xPos, 475+yPos);  // vertical line in left window


  rect(415+xPos, 250+yPos, 100, 225);  // outside of right window
  line(415+xPos, 363+yPos, 515+xPos, 363+yPos);  // horizontal line in right window
  line(465+xPos, 250+yPos, 465+xPos, 475+yPos);  // vertical line of right window

  fill(153, 102, 51);
  rect(250+xPos, 250+yPos, 100, 300);  // border of door
  fill(255, 255, 255);
  ellipse(270+xPos, 393+yPos, 15, 15); // door knob
}
