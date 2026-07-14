package com.example.randomquote.data;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class LocalQuoteRepository_Factory implements Factory<LocalQuoteRepository> {
  @Override
  public LocalQuoteRepository get() {
    return newInstance();
  }

  public static LocalQuoteRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LocalQuoteRepository newInstance() {
    return new LocalQuoteRepository();
  }

  private static final class InstanceHolder {
    private static final LocalQuoteRepository_Factory INSTANCE = new LocalQuoteRepository_Factory();
  }
}
