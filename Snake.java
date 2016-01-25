class Snake{    //snake head class
    
    private double x;
    private double y;
    private double size;
    
    public Snake(double x, double y) {
        this.x = x;
        this.y = y;
        size = 0.25;
    }
    
    // O(1)   ← IS IT O(1) OR O(N)???
    public double getX(){
	return x; 
    }
    // O(1)   ← IS IT O(1) OR O(N)???
    public double getY(){
	return y; 
    }
    
    public void draw(){
	StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(x, y, size);
    }
    
    public void move(int input){
        if(input == 1) y += 0.15;  // up
	if(input == 2) y -= 0.15;  // down
	if(input == 3) x -= 0.15;  // left
	if(input == 4) x += 0.15;  // right
	
	if (getX() == 20 || getX() > 20 ||
	    getY() == 20 || getY() > 20 ||
	    getX() == 0 || getX() < 0 ||
	    getY() == 0 || getY() < 0){
	    StdDraw.clear(StdDraw.RED);
	}
    }
    
}
