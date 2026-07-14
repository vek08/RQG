package com.example.randomquote.data

import com.example.randomquote.domain.Quote
import com.example.randomquote.domain.QuoteRepository
import kotlinx.coroutines.delay
import javax.inject.Inject

class LocalQuoteRepository @Inject constructor() : QuoteRepository {
    
    // Simulate some network delay for loading animation demonstration
    override suspend fun getAllQuotes(): List<Quote> {
        delay(500)
        return quotesList
    }

    private val quotesList = listOf(
        Quote("Be yourself; everyone else is already taken.", "Oscar Wilde"),
        Quote("I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.", "Marilyn Monroe"),
        Quote("Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.", "Albert Einstein"),
        Quote("So many books, so little time.", "Frank Zappa"),
        Quote("A room without books is like a body without a soul.", "Marcus Tullius Cicero"),
        Quote("Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.", "Bernard M. Baruch"),
        Quote("You've gotta dance like there's nobody watching, Love like you'll never be hurt, Sing like there's nobody listening, And live like it's heaven on earth.", "William W. Purkey"),
        Quote("You know you're in love when you can't fall asleep because reality is finally better than your dreams.", "Dr. Seuss"),
        Quote("You only live once, but if you do it right, once is enough.", "Mae West"),
        Quote("Be the change that you wish to see in the world.", "Mahatma Gandhi"),
        Quote("In three words I can sum up everything I've learned about life: it goes on.", "Robert Frost"),
        Quote("If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.", "J.K. Rowling"),
        Quote("Don't walk in front of me… I may not follow. Don't walk behind me… I may not lead. Walk beside me… just be my friend.", "Albert Camus"),
        Quote("If you tell the truth, you don't have to remember anything.", "Mark Twain"),
        Quote("Friendship ... is born at the moment when one man says to another \"What! You too? I thought that no one but myself . . .\"", "C.S. Lewis"),
        Quote("I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.", "Maya Angelou"),
        Quote("A friend is someone who knows all about you and still loves you.", "Elbert Hubbard"),
        Quote("To live is the rarest thing in the world. Most people exist, that is all.", "Oscar Wilde"),
        Quote("Always forgive your enemies; nothing annoys them so much.", "Oscar Wilde"),
        Quote("Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that.", "Martin Luther King Jr."),
        Quote("Live as if you were to die tomorrow. Learn as if you were to live forever.", "Mahatma Gandhi"),
        Quote("We accept the love we think we deserve.", "Stephen Chbosky"),
        Quote("Without music, life would be a mistake.", "Friedrich Nietzsche"),
        Quote("I am so clever that sometimes I don't understand a single word of what I am saying.", "Oscar Wilde"),
        Quote("To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.", "Ralph Waldo Emerson"),
        Quote("Here's to the crazy ones. The misfits. The rebels. The troublemakers. The round pegs in the square holes. The ones who see things differently. They're not fond of rules. And they have no respect for the status quo. You can quote them, disagree with them, glorify or vilify them. About the only thing you can't do is ignore them. Because they change things. They push the human race forward. And while some may see them as the crazy ones, we see genius. Because the people who are crazy enough to think they can change the world, are the ones who do.", "Rob Siltanen"),
        Quote("It is better to be hated for what you are than to be loved for what you are not.", "Andre Gide"),
        Quote("Twenty years from now you will be more disappointed by the things that you didn't do than by the ones you did do. So throw off the bowlines. Sail away from the safe harbor. Catch the trade winds in your sails. Explore. Dream. Discover.", "H. Jackson Brown Jr."),
        Quote("The person, be it gentleman or lady, who has not pleasure in a good novel, must be intolerably stupid.", "Jane Austen"),
        Quote("Imperfection is beauty, madness is genius and it's better to be absolutely ridiculous than absolutely boring.", "Marilyn Monroe")
    )
}
