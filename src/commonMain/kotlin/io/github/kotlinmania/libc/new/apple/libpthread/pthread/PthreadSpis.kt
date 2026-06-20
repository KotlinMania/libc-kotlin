// port-lint: source new/apple/libpthread/pthread_/pthread_spis.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

/**
 * Header: `pthread/pthread_spis.h`.
 */

public expect fun pthreadCreateFromMachThread(
    thread: PthreadT?,
    attr: PthreadAttrT?,
    f: (COpaquePointer?) -> COpaquePointer?,
    value: COpaquePointer?,
): CInt
