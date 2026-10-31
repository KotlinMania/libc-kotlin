// port-lint: source new/apple/libpthread/pthread_/introspection.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public typealias PthreadIntrospectionHookT = PthreadIntrospectionHook

public expect fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHook?): PthreadIntrospectionHook?

public expect fun pthreadIntrospectionSetspecificNp(thread: ULong, key: Int, value: COpaquePointer?): Int

public expect fun pthreadIntrospectionGetspecificNp(thread: ULong, key: Int): COpaquePointer?
