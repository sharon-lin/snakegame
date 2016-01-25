import java.awt.event.*;
import java.awt.Color;
import java.util.ArrayList;

public class SnakeApp{
   
    static Snake snake = null;
    static Food food = null;
    static SnakeBody snakebody = null;

    public static void setup(){
        snake = new Snake(10.0, 10.0);
	food = new Food(Math.random() * 20, Math.random() * 20);
	
    }

    public static void draw(){
        StdDraw.clear(StdDraw.GREEN);
	snake.draw();
	food.draw();
	//Movement keys
	if (StdDraw.isKeyPressed(KeyEvent.VK_UP))  
            snake.move(1);
	if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN))
            snake.move(2);
	if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) 
	    snake.move(3);
	if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) 
	    snake.move(4);
        	
        //When the Snake eats a food
	if(food.detect(snake)){
	    StdDraw.clear(StdDraw.RED);
	    snakebody = new SnakeBody(snake.getX()+0.3, snake.getY()+0.3);
	    snakebody.draw();
	    //set food to new location
	    food = new Food(Math.random()*20, Math.random()*20);
	}
    }
	
    public static void main(String[] args){
	StdDraw.setXscale(0.0,20.0);
	StdDraw.setYscale(0.0,20.0);
       	setup();
	while(true){
            draw();
	    StdDraw.show(15);
        }
    }
          
}
