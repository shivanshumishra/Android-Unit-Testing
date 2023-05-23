package com.shiv.androidunittesting.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setUp(){
        helper = Helper()
    }

    @After
    fun tearDown(){
        println("after every test case")
    }

    @Test
    fun isPalindrome() {

        //Arrange


        //Act
        val result = helper.isPalindrome("hello")

        //Assert
        assertEquals(false,result)
    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {

        //Act
        val result = helper.isPalindrome("level")

        //Assert
        assertEquals(true,result)
    }
}