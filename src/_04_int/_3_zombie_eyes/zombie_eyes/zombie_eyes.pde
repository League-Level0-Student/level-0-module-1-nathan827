
void setup() {
PImage face = loadImage("face.png");
size(500,500);
face.resize (500,500);
image(face,0,0);
}
void draw() {
fill(0,mouseX,mouseY);
ellipse(200,225,75,50);
ellipse(300,225,75,50);
fill(0,0,0);
ellipse(200,225,25,25);
ellipse(300,225,25,25);
}
