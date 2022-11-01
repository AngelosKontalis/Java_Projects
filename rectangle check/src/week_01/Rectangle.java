package week_01;

public class Rectangle {
	private float x=0;
	private float y=0;
	private float width,height=0;
	static int number_of_rect=0;
	
	Rectangle (float px, float py, float w, float h){
		x=px;
		y=py;
		width=w;
		height=h;
		number_of_rect = number_of_rect + 1;
	}
	
	public boolean contains (float sx, float sy) {
		boolean res=false;
		
		if (sx >= x && sx <= width && sy>= y && sy<= height) {
			res=true;
		}
		
		
		return res;
	}
}
