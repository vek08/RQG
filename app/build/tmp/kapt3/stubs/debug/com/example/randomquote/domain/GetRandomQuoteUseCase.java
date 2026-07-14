package com.example.randomquote.domain;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0006H\u0086B\u00a2\u0006\u0002\u0010\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/randomquote/domain/GetRandomQuoteUseCase;", "", "repository", "Lcom/example/randomquote/domain/QuoteRepository;", "(Lcom/example/randomquote/domain/QuoteRepository;)V", "lastQuote", "Lcom/example/randomquote/domain/Quote;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetRandomQuoteUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.randomquote.domain.QuoteRepository repository = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.randomquote.domain.Quote lastQuote;
    
    @javax.inject.Inject()
    public GetRandomQuoteUseCase(@org.jetbrains.annotations.NotNull()
    com.example.randomquote.domain.QuoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.randomquote.domain.Quote> $completion) {
        return null;
    }
}