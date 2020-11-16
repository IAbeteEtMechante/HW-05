package space.harbour.java.hw5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



public class MyHashMapTest {
    private MyHashMap<String, String> contacts;

    @Before
    public void createHashmap() {
        contacts = new MyHashMap<String, String>();
    }

    //test01: adding a pair
    @Test
    public void addingOnePair() {
        contacts.put("Ahmed", "123-456-789");
        assertEquals(contacts.size(), 1);
        assertTrue(contacts.containsKey("Ahmed"));
        assertTrue(contacts.containsValue("123-456-789"));
    }

    //test02: removing a pair
    @Test
    public void removingOnePair() {
        contacts.put("Ahmed", "123-456-789");
        contacts.remove("Ahmed");

        assertEquals(contacts.size(), 0);
        assertFalse(contacts.containsKey("Ahmed"));
        assertFalse(contacts.containsValue("123-456-789"));
    }

    //test03: changing value by key
    @Test
    public void changeValueByKey() {
        contacts.put("Ahmed", "123-456-789");
        contacts.remove("Ahmed");

        assertEquals(contacts.size(), 0);
        assertFalse(contacts.containsKey("Ahmed"));
        assertFalse(contacts.containsValue("123-456-789"));
    }

    //test04: retrieving a value by non-existent key
    @Test
    public void retrieveValueFromNonExistentKey() {
        assertNull(contacts.get("Pierre"));
        contacts.put("Ahmed", "123-456-789");
        assertNull(contacts.get("Pierre"));
        contacts.put("Vasilii", "888-888-888");
        assertNull(contacts.get("Pierre"));
    }

    //test05: adding a pair with key = null
    //@Test
    //public void addNullKey() {
    //    contacts.put("Ahmed", "123-456-789");
    //    contacts.put(null, "987-654-321");
    //    assertTrue(contacts.containsKey(null));
    //}

    //test06: adding a pair with value = null
    @Test
    public void addNullValue() {
        contacts.put("Ahmed", "123-456-789");
        contacts.put("Pierre", null);
        assertNull(contacts.get("Pierre"));
    }

    //test07: adding many pairs then removing them and checking that map is empty
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