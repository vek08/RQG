package com.example.randomquote.domain

import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val repository: QuoteRepository
) {
    private var lastQuote: Quote? = null

    suspend operator fun invoke(): Quote {
        val quotes = repository.getAllQuotes()
        if (quotes.isEmpty()) {
            return Quote("No quotes available.", "System")
        }
        if (quotes.size == 1) {
            return quotes.first()
        }

        var nextQuote: Quote
        do {
            nextQuote = quotes.random()
        } while (nextQuote == lastQuote)

        lastQuote = nextQuote
        return nextQuote
    }
}
