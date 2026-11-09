// port-lint: source new/apple/libpthread/pthread_/sched.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt

public open class SchedParam(public var schedPriority: CInt, public var opaque: List<CChar>)
