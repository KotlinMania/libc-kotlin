// port-lint: source new/apple/libpthread/pthread_/stack_np.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public expect fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: UintptrT?): UintptrT
