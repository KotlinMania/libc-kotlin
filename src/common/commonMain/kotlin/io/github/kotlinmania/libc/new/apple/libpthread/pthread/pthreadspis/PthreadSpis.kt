// port-lint: source new/apple/libpthread/pthread_/pthread_spis.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadspis

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

// Header: `pthread / pthreadSpis.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/pthreadSpis.h>

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public expect fun pthreadCreateFromMachThread(thread: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt
