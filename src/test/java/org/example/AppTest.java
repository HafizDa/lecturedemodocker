package org.example;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AppTest {
   App app = new App();
    @Test
    public void addMeTest() {
        assertEquals(5, app.addMe(2, 3), 5);
    }
}
