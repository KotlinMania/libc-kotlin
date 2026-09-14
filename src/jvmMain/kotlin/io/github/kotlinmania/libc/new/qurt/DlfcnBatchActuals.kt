// port-lint: source Dlfcn.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen not available on JVM — no C library access")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose not available on JVM — no C library access")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym not available on JVM — no C library access")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror not available on JVM — no C library access")

