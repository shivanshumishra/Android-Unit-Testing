package com.shiv.androidunittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {

//    @Before
//    fun setUp() {
//    }
//
//    @After
//    fun tearDown() {
//    }

    @Test(expected = FileNotFoundException::class)
    fun populateQuotesFromAssests_emptyFilename_expected_Exception() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuotesFromAssests(context,"")
    }

    @Test(expected = JsonSyntaxException::class)
    fun populateQuotesFromAssests_invalidJson_expected_Exception() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuotesFromAssests(context,"malformed.json")
    }

    @Test()
    fun populateQuotesFromAssests_ValidJson_expected_Count() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuotesFromAssests(context,"quotes.json")
        assertEquals(102,quoteManager.quoteList.size)
    }
}