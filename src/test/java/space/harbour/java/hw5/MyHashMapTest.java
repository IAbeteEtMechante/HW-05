package space.harbour.java.hw5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



public class MyHashMapTest {
    private MyHashMap<String, String> contacts;

    @Before
    public void createHashmap() {
        contacts = new MyHashMap<String, String>();
    }

    //adding a pair
    @Test
    public void addingOnePair() {
        contacts.put("Ahmed", "123-456-789");
        assertEquals(contacts.size(), 1);
        assertTrue(contacts.containsKey("Ahmed"));
        assertTrue(contacts.containsValue("123-456-789"));
    }

    //removing a pair
    @Test
    public void removingOnePair() {
        contacts.put("Ahmed", "123-456-789");
        contacts.remove("Ahmed");

        assertEquals(contacts.size(), 0);
        assertFalse(contacts.containsKey("Ahmed"));
        assertFalse(contacts.containsValue("123-456-789"));
    }

    //changing value by key
    //retrieving a value by non-existent key
    // adding a pair with key = null
    //adding a pair with value = null
    //adding many pairs then removing them and checking that map is empty
    @Test
    public void size() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void containsKey() {
    }

    @Test
    public void containsValue() {
    }

    @Test
    public void get() {
    }

    @Test
    public void put() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void putAll() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void keySet() {
    }

    @Test
    public void values() {
    }

    @Test
    public void entrySet() {
    }
}