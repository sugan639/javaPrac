import com.util.customexception.*;


public class XUV extends Car {
    private int seats;
    private int airbags;
    private String model;
    private String color;

    public XUV() throws TaskException {
        super("XUV constructor called");
    }

    public int getSeats() { 
    	return seats; 
    		}
    public void setSeats(int seats) { 
    	this.seats = seats; 
    		}
    public int getAirbags() {
    	 return airbags; 
    	 	}
    public void setAirbags(int airbags) { 
    	this.airbags = airbags; 
    		}
    public String getModel() {	
    	 return model;
    	 	 }
    public void setModel(String model) { 
    	this.model = model;
    		 }
    public String getColor() { 
    	return color; 
    		}
    public void setColor(String color) { 
    	this.color = color; 
    		}
}
