package com.example.randomquote.domain

interface QuoteRepository {
    suspend fun getAllQuotes(): List<Quote>
}
