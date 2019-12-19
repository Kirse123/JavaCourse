package com.Kirill.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class countWorldsTest {

    @Test
    public void ShouldCountWordsInStr() {
        String str = "Hey this is super Test";
        assertEquals(countWorlds.CountWordsInStr(str).size(), 5);
    }
}