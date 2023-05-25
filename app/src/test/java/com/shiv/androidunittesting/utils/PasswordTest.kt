package com.shiv.androidunittesting.utils

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_inputBlank_expectedRequiredField(){
        val sut = Utils()
        val result = sut.validPassword("  ")
        assertEquals("Password field is required",result)
    }

    @Test
    fun validatePassword_input2Char_expectedRequiredField(){
        val sut = Utils()
        val result = sut.validPassword("ab")
        assertEquals("Length of the password must be greater than 6",result)
    }

    @Test
    fun validatePassword_input16Char_expectedRequiredField(){
        val sut = Utils()
        val result = sut.validPassword("1234567890123456")
        assertEquals("Length of the password must be lesser than 15",result)
    }

    @Test
    fun validatePassword_inputValid_expectedValid(){
        val sut = Utils()
        val result = sut.validPassword("1234567890123")
        assertEquals("Valid",result)
    }
}