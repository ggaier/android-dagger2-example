package com.mindorks.example.android_dagger2_example.di.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideContextFactory implements Factory<Context> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideContextFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvideContextFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideContextFactory(module);
  }

  public static Context proxyProvideContext(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
