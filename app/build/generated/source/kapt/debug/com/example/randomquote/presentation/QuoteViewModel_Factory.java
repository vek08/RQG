package com.example.randomquote.presentation;

import com.example.randomquote.domain.GetRandomQuoteUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class QuoteViewModel_Factory implements Factory<QuoteViewModel> {
  private final Provider<GetRandomQuoteUseCase> getRandomQuoteUseCaseProvider;

  public QuoteViewModel_Factory(Provider<GetRandomQuoteUseCase> getRandomQuoteUseCaseProvider) {
    this.getRandomQuoteUseCaseProvider = getRandomQuoteUseCaseProvider;
  }

  @Override
  public QuoteViewModel get() {
    return newInstance(getRandomQuoteUseCaseProvider.get());
  }

  public static QuoteViewModel_Factory create(
      Provider<GetRandomQuoteUseCase> getRandomQuoteUseCaseProvider) {
    return new QuoteViewModel_Factory(getRandomQuoteUseCaseProvider);
  }

  public static QuoteViewModel newInstance(GetRandomQuoteUseCase getRandomQuoteUseCase) {
    return new QuoteViewModel(getRandomQuoteUseCase);
  }
}
