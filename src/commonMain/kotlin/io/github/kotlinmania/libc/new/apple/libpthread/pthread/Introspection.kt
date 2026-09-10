// port-lint: source new/apple/libpthread/pthread_/introspection.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public typealias PthreadIntrospectionHookT = ((CUInt, PthreadT, COpaquePointer?, ULong) -> Unit)?

public fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt 
public expect fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? 