class SnakeBody{
    
    private double x;
    private double y;
    private double size;

    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;
    

    public SnakeBody(double x, double y) {
        this.x = x;
        this.y = y;
        size = 0.25;
    }
    
    public double getX(){
	return x; 
    }
    public double getY(){
	return y; 
    }
    
    public void draw(){
	StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(x, y, size);
    }
    
    public void move(){
	//x += snake.getX() + 0.3;
	//y += snake.getY() + 0.3;
    }
}


