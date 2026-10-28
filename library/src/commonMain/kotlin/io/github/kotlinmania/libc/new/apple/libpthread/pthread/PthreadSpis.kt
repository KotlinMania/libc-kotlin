// port-lint: source new/apple/libpthread/pthread_/pthread_spis.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public expect fun pthreadCreateFromMachThread(thread: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int
