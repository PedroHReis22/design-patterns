package curso.objectPool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
	
	protected long expirationTime;
	private Hashtable<T, Long> locked, unlocked;
	
	public ObjectPool() {
		expirationTime = 15000;
		locked = new Hashtable<>();
		unlocked = new Hashtable<>();
	}
	
	protected abstract T create();

	public abstract boolean validate(T t);
	
	public abstract void expire(T t);
	
	public synchronized T acquire() {
		
		T t;
		
		long now = System.currentTimeMillis();
		
		if(unlocked.size() > 0) {
			
			Enumeration<T> e = unlocked.keys();
			
			while(e.hasMoreElements()) {
				
				t = e.nextElement();
				
				if((now - unlocked.get(t)) > expirationTime) { //objeto expirado
					unlocked.remove(t);
					expire(t);
					t = null;
				}
				else if(validate(t)){
					unlocked.remove(t);
					locked.put(t, now);
					return t;
				}
				else {
					unlocked.remove(t);
					expire(t);
					t = null;
				}
				
			}
			
		}
		
		t = create();
		locked.put(t, now);
		
		return t;
		
	}
	
	public synchronized void release(T t) {
		unlocked.put(t, locked.remove(t));
	}
	
	public long getExpirationTime() {
		return expirationTime;
	}
	
}
