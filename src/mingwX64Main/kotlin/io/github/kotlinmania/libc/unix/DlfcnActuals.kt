@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen is not available on Windows (mingwX64)")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror is not available on Windows (mingwX64)")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym is not available on Windows (mingwX64)")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose is not available on Windows (mingwX64)")