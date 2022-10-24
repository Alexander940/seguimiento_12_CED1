package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreeAVLTest {

    TreeAVL tree;

    @Before
    public void setUp() throws Exception {
        tree = new TreeAVL();
    }

    @Test
    public void insert_one_node_when_it_is_empty_and_it_have_size_equals_1() {
        tree.insert(9);

        assertEquals(1, tree.size());
    }

    @Test
    public void insert_one_node_and_search_it() {
        tree.insert(9);

        assertTrue(tree.search(9));
    }

    @Test
    public void delete_one_node() {
        tree.insert(9);
        tree.insert(3);
        tree.insert(6);

        tree.delete(3);

        assertFalse(tree.search(3));
    }

    @Test
    public void delete_the_unique_node() {
        tree.insert(9);

        tree.delete(9);

        assertNull(tree.getRoot());
    }
}