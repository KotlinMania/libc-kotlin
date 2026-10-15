// port-lint: source Mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public actual fun atexit(cb: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit not available on JVM — no C library access")

public actual fun pthreadKeyCreate(key: UInt?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate not available on JVM — no C library access")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on JVM — no C library access")

public actual fun clone(cb: ((COpaquePointer?) -> Int)?, childStack: COpaquePointer?, flags: Int, arg: COpaquePointer?, vararg args: Any?): Int =
    throw UnsupportedOperationException("clone not available on JVM — no C library access")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on JVM — no C library access")

public actual fun pthreadCreate(native: ULong?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on JVM — no C library access")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr not available on JVM — no C library access")
