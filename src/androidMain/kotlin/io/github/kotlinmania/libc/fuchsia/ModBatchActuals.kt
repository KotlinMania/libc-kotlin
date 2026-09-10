// port-lint: source Mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public actual fun atexit(cb: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit not available on Android host — use androidNative target for FFI")

public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadKeyCreate not available on Android host — use androidNative target for FFI")

public actual fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt =
    throw UnsupportedOperationException("glob not available on Android host — use androidNative target for FFI")

public actual fun clone(cb: ((COpaquePointer?) -> CInt)?, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("clone not available on Android host — use androidNative target for FFI")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlIteratePhdr not available on Android host — use androidNative target for FFI")
