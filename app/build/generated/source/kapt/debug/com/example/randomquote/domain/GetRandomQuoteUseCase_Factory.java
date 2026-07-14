package com.example.randomquote.domain;

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
public final class GetRandomQuoteUseCase_Factory implements Factory<GetRandomQuoteUseCase> {
  private final Provider<QuoteRepository> repositoryProvider;

  public GetRandomQuoteUseCase_Factory(Provider<QuoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetRandomQuoteUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetRandomQuoteUseCase_Factory create(Provider<QuoteRepository> repositoryProvider) {
    return new GetRandomQuoteUseCase_Factory(repositoryProvider);
  }

  public static GetRandomQuoteUseCase newInstance(QuoteRepository repository) {
    return new GetRandomQuoteUseCase(repository);
  }
}
