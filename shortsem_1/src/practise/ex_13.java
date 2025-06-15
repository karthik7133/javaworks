package practise;

public class ex_13 {
	public static void main(String[] args) {
		SensorDate s=new SensorDate(50,41);
		s.display();
	}
}
class TemperatureSensor{
	float temp;
	TemperatureSensor(float t){
		this.temp=t;
	}
	
	public float getTemp() {
			if(temp>40) {
				throw new ArithmeticException("Temp is high");
		}return temp;
	}
}
class PressureSensor {
	float pressure;
	PressureSensor(float p){
		this.pressure=p;
	}
	public float getpressure() {
		
			if(pressure>100) {
				throw new NullPointerException("Pressure is high");
			}return pressure;
	}
}
class SensorDate extends PressureSensor{
	TemperatureSensor te;
	SensorDate(float p,float t) {
		super(p);
		te=new TemperatureSensor(t);
		
	}

	public void display() {
		try {
			System.out.println("temp is :"+te.getTemp());
		}catch(ArithmeticException e1) {
			System.out.println(e1.getMessage());
		}
		
		try {
			System.out.println("Pressure is:"+getpressure());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
	}
}

