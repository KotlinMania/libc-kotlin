// port-lint: source Dlfcn.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires manual FFI bridge — not yet implemented")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose requires manual FFI bridge — not yet implemented")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires manual FFI bridge — not yet implemented")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror requires manual FFI bridge — not yet implemented")
