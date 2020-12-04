PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
  size(500,500);
  fill(#C69324);
  ellipse(250,250,250,250);
  fill(255,0,0,255);
  ellipse(250,250,225,225);
  fill(#F4FC0F);
  ellipse(250,250,210,210);
  pepperoni = loadImage("pepperoni.png");
  pepperoni.resize(30,30);
  olive = loadImage("olive.png");
  olive.resize(15,15);
  mushroom = loadImage("mushroom.png");
  mushroom.resize(20,20);
    
}
void draw() {
    image(pepperoni,200,200);
    image(pepperoni,260,180);
    image(pepperoni,290,280);
    image(pepperoni,240,250);
    image(pepperoni,190,290);
    image(pepperoni,170,240);
    image(olive, 230,160);
    image(olive, 300,220);
    image(olive,250,300);
    image(olive, 170,190);
    image(mushroom, 250,220);
    image(mushroom, 230,320);
    image(mushroom, 210,250);
    image(mushroom, 320,250);
}
