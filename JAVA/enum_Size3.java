package enumeration.ust;

enum enum_Size3{
	SMALL,MEDIUM,LARGE,EXTRALARGE;

public String getSize() {
	switch(this) {
	case SMALL:
		return "small";
	
	case MEDIUM:
		return "large";
		
	case EXTRALARGE:
		return "extra large";
	
	default:
		return null;
	}
}




public static void main(String[] args) {
	System.out.println("The size of the pizza is "+enum_Size3.SMALL.getSize());	
	}
}
