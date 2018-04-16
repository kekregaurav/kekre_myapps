package arraystring;



class Rectangle {

    // "zero" rectangle
    public static final Rectangle NO_RECTANGLE = new Rectangle();

    // coordinates of bottom left corner
    private int leftX;
    private int bottomY;

    // dimensions
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(int leftX, int bottomY, int width, int height) {
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width  = width;
        this.height = height;
    }

    public int getLeftX() {
        return leftX;
    }

    public int getBottomY() {
        return bottomY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}





public class RectangleIntersection {
	
	
	
   public static Rectangle findInterSection2(Rectangle r1, Rectangle r2){
		
	     Rectangle r = new Rectangle();
		//get the start and end points on x-axis for both r1 and r2
		int a = 0, b=0, c=0, d=0;
		int rx = 0, rw =0, ry =0, rl = 0;
		
		if(r1.getLeftX() <= r2.getLeftX()){
			a = r1.getLeftX();
			b = r2.getLeftX();
		}else{
			a = r2.getLeftX();
			b = r1.getLeftX();
		}
		
		if((r1.getLeftX() + r1.getWidth()) <= (r2.getLeftX() + r2.getWidth())){
			c = r1.getLeftX() + r1.getWidth();
			d = r2.getLeftX() + r2.getWidth();
		}else{
			d = r1.getLeftX() + r1.getWidth();
			c = r2.getLeftX() + r2.getWidth();
		}
		
		if(c < b){
			System.out.println("No No");
			return null;
		}else{
			rx = b;
			rw =  (c-b);
		}
		
		System.out.println("a: "+a+", b: "+b+", c: "+c+", d: "+d);
		System.out.println("rx: "+rx+", rw: "+rw);
		
		//do it for Y-axis
		if(r1.getBottomY() <= r2.getBottomY()){
			a = r1.getBottomY();
			b = r2.getBottomY();
		}else{
			a = r2.getBottomY();
			b = r1.getBottomY();
		}
		
		if((r1.getBottomY() + r1.getHeight()) <= (r2.getBottomY() + r2.getHeight())){
			c = r1.getBottomY() + r1.getHeight();
			d = r2.getBottomY() + r2.getHeight();
		}else{
			d = r1.getBottomY() + r1.getHeight();
			c = r2.getBottomY() + r2.getHeight();
		}
		
		if(c < b){
			System.out.println("No No");
			return null;
		}else{
			ry= b;
			rl =  (c-b);
		}
		
		System.out.println("a: "+a+", b: "+b+", c: "+c+", d: "+d);
		System.out.println("ry: "+ry+", rl: "+rl);
		
		return null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(-2, 3, 1, 4);
		Rectangle r2 = new Rectangle(-3, 1, 6, 3);
		
		findInterSection2(r1, r2);

	}

}
