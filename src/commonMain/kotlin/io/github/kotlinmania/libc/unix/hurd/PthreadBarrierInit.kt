// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.unix.hurd.PthreadBarrier?, attr: io.github.kotlinmania.libc.unix.hurd.PthreadBarrierattr?, count: UInt): Int
