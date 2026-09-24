package com.example.maven_github_demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class JavaTest {
@Test
void testTotal() {
	assertEquals(225,Grade_calculator.calculateTotal(75,68,82));	
}
@Test
void testAverage() {
	assertEquals(75.0,Grade_calculator.calculateAverage(75,68,82));
}
@Test
void testPass() {
	assertTrue(Grade_calculator.isPass(75.0));
}
@Test
void testFail() {
	assertFalse(Grade_calculator.isPass(35.0));
}
}
