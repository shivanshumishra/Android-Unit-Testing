package com.shiv.androidunittesting.utils

class Utils {
    fun validPassword(password:String) = when {
        password.isBlank() -> {
            "Password field is required"
        }

        password.length < 6 -> {
            "Length of the password must be greater than 6"
        }

        password.length > 15 -> {
            "Length of the password must be lesser than 15"
        }

        else -> {
            "Valid"
        }
    }
}