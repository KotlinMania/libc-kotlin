// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadSetschedparam(native: io.github.kotlinmania.libc.COpaquePointer?, policy: Int, param: SchedParam?): Int
