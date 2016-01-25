class Food{

    private double x;
    private double y;
    private double size;
    
    public Food(double x, double y){
	this.x = x;
	this.y = y;
	size = 0.20;
    }

    public double getX(){
	return x;
    }
    public double getY(){
	return y;
    }
    
    public void draw(){
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.filledCircle(x, y, size);
    }

    
    public boolean detect(Snake s){
	double x1 = s.getX();
	double y1 = s.getY();
	double minX = x - size;
	double maxX = x + size;
        double minY = y - size;
        double maxY = y + size;
	return (minX <= x1 && x1 <= maxX && minY <= y1 && y1 <= maxY);
    }
    
}
