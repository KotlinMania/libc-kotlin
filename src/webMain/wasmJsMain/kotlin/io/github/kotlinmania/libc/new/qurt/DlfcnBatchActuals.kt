// port-lint: source Dlfcn.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun dlopen(filename: String?, flag: Int): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires N-API addon")

public actual fun dlclose(handle: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlclose requires N-API addon")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires N-API addon")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror requires N-API addon")
