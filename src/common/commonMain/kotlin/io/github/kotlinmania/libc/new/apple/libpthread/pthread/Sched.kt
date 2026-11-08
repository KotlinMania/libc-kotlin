// port-lint: source new/apple/libpthread/pthread_/sched.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public open class SchedParam(public var schedPriority: CInt, public var opaque: List<CChar>)
