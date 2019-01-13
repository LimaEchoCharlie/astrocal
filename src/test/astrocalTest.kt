package test

import astrocal.add1
import org.testng.annotations.Test
import kotlin.test.assertEquals

@Test
fun add1TestZero(){
    assertEquals(1, add1(0))
}

@Test
fun add1TestOne(){
    assertEquals(2, add1(1))
}
