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
        contacts.put("Karim", "123-456-789");
        assertEquals(contacts.size(), 1);
        assertTrue(contacts.containsKey("Karim"));
        assertTrue(contacts.containsValue("123-456-789"));
    }

    //test02: removing a pair
    @Test
    public void removingOnePair() {
        contacts.put("Patricia", "123-456-789");
        contacts.remove("Patricia");

        assertEquals(contacts.size(), 0);
        assertFalse(contacts.containsKey("Patricia"));
        assertFalse(contacts.containsValue("123-456-789"));
    }

    //test03: changing value by key
    @Test
    public void changeValueByKey() {
        contacts.put("Duc", "123-456-789");
        contacts.put("Duc", "888-888-888");
        assertFalse(contacts.containsValue("123-456-789"));
        assertTrue(contacts.containsValue("888-888-888"));


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

    ////test07: adding many pairs then removing them and checking that map is empty
    //@Test
    //public void addAndRemoveManyPairs() {
    //    for (int i = 0; i < 10; i++) {
    //        contacts.put("Ahmed" + String.valueOf(i), String.valueOf(i));
    //    }
    //    for (int i = 0; i < 10; i++) {
    //        contacts.remove("Ahmed" + String.valueOf(i));
    //    }
    //    assertEquals(contacts.isEmpty(),0);
    //
    //}

    //test08: general correctness of size()
    @Test
    public void size() {
        for (int i = 0; i < 100; i++) {
            contacts.put("Ahmed" + String.valueOf(i), String.valueOf(i));
        }
        assertEquals(contacts.size(), 100);
    }

    //test09:  extreme conditions for size()
    @Test
    public void sizeForBigOrSmallHashMap() {
        //empty one
        assertEquals(contacts.size(), 0);

        //one element
        contacts.put("Ahmed", "123-456-789");
        assertEquals(contacts.size(), 1);

        //big one
        for (int i = 1; i < 100_000; i++) {
            contacts.put("Ahmed" + String.valueOf(i), String.valueOf(i));
        }
        assertEquals(contacts.size(), 100_000);
    }

    //test10 :
    @Test
    public void isEmpty() {
        assertEquals(contacts.size(), 0);
    }

    //test11 :
    @Test
    public void containsKey() {
        contacts.put("Pierre", "888-888-888");
    }

    //test12 :
    @Test
    public void containsValue() {
    }

    //test13 :
    @Test
    public void get() {
    }

    //test14 :
    @Test
    public void put() {
    }

    //test15 :
    @Test
    public void remove() {
    }

    //test16 :
    @Test
    public void putAll() {
    }

    //test17 :
    @Test
    public void clear() {
    }

    //test18 :
    @Test
    public void keySet() {
    }

    //test19 :
    @Test
    public void values() {
    }

    //test20 :
    @Test
    public void entrySet() {
    }
}