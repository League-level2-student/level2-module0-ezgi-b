int[] bob;
int[] red;
int[] green;
int[] blue;

void setup() {
  size(500,500);
  bob = new int[width];
  randomizeArray(bob,height);
  noStroke();
  
  red = new int[width];
  randomizeArray(red,256);
  
  green = new int[width];
  randomizeArray(green,256);
  
  blue = new int[width];
  randomizeArray(blue,256);
}

void draw(){
  if(mousePressed){
    randomizeArray(bob, height);
  }
  background(150,200,150);
 for(int i = 0; i<bob.length; i++){
   fill(red[i] ,green[i] , blue[i]);
    rect(i, height, 1, -bob[i]);
  }
  stepSort(bob);
}
void randomizeArray(int[] arr, int num){
  for(int i = 0; i<width; i++){
    arr[i] = (int) random(num);
  }
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
