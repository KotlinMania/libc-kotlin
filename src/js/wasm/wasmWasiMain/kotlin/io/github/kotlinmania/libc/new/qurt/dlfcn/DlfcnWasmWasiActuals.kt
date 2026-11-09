@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.CInt

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    null

public actual fun dlclose(handle: COpaquePointer?): CInt =
    0

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    null

public actual fun dlerror(): COpaquePointer? =
    null
