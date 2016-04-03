package curso.creational.multiton;

import java.util.HashMap;

public class Camera {
	
	private static HashMap<Long, Camera> instance = new HashMap<>();
	
	private long hardwareId;
	private String location;
	
	static {
		
		Camera cam1 = new Camera(1234, "Left Store");
		Camera cam2 = new Camera(4321, "Right Store");
		
		instance.put(1234L, cam1);
		instance.put(4321L, cam2);
		
	}	
	
	public static Camera getInstance(long hardwareId) {
		
		if(!Camera.instance.containsKey(hardwareId))
			throw new IllegalArgumentException("Hardware desconhecido");
		
		return Camera.instance.get(hardwareId);
	}
	
	private Camera(long hardwareId, String location) {
		this.hardwareId = hardwareId;
		this.location = location;
	}
	
	public long getHardwareId() {
		return hardwareId;
	}
	
	public void setHardwareId(long hardwareId) {
		this.hardwareId = hardwareId;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
}
