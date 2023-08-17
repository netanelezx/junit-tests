package org.example;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DatabaseTest {
	private static Database db;
	private Database dbTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		db = new Database();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// Copies the current database into a temp variable
		this.dbTest = new Database(db);
	}

	@After
	public void tearDown() throws Exception {
	}

	// Tests the store method for storing info into the database
	@Test
	public void testStore() {
		this.dbTest.store(5, 10);
		assertEquals(10, this.dbTest.getStorage()[5]);
	}

	// Tests the get method for getting information from the database
	@Test
	public void testGet() {
		int[] db = this.dbTest.getStorage();
		db[5] = 10;
		
		this.dbTest.setStorage(db);
		assertEquals(10, this.dbTest.get(5));
	}
	
	// Tests if two databases have equal data (by value not by ref)
	@Test
	public void testEqualsTrue() {
		Database dbOther = new Database();
		dbOther.store(9, 5);
		
		dbTest.store(9, 5);
		
		assertTrue(dbTest.equals(dbOther));
		assertTrue(Arrays.equals(dbTest.getStorage(), dbOther.getStorage()));
	}
	
	@Test
	public void testEmptyEquals() {
		Database db1 = new Database();
		Database db2 = new Database();
		
		// Makes sure the addresses are different
		assertFalse(db1 == db2);
		assertFalse(db1.getStorage() == db2.getStorage());
		assertFalse(db1.getStorage().equals(db2.getStorage()));
		
		// same empty data
		assertTrue(db1.equals(db2));
		assertTrue(Arrays.equals(db1.getStorage(), db2.getStorage()));
	}
	
	@Test
	public void testEqualsFalse() {
		Database dbOther = new Database();
		dbOther.store(9, 5);
		
		dbTest.store(8, 5);
		
		assertFalse(dbTest.equals(dbOther));
		assertFalse(Arrays.equals(dbTest.getStorage(), dbOther.getStorage()));
	}
}
