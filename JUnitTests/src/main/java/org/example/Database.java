package org.example;

import java.util.Arrays;

/**
 * Basic database class used for JUnit testing
 * @author tanif
 *
 */

public class Database {
	private final int MAX_LEN = 10;
	private int[] storage;
	
	public Database() {
		this.storage = new int[MAX_LEN];
	}
	
	public Database(Database db) {
		this.storage = db.storage.clone();
	}
	
	// store element in database by index and value
	public void store(int i, int val) throws ArrayIndexOutOfBoundsException {
		this.storage[i] = val;
	}
	
	// get element in database by index and returns the value (0 if empty)
	public int get(int i) throws ArrayIndexOutOfBoundsException {
		return this.storage[i];
	}
	
	// objects are equal only if they are both databases and 
	// have the same storage (by value)
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Database && Arrays.equals(((Database)obj).getStorage(), this.storage);
	}
	
	
	/* Only used for testing */
	
	public int[] getStorage() {
		return this.storage;
	}
	
	public void setStorage(int[] storage) {
		this.storage = storage;
	}
}
