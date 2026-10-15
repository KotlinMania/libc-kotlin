// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadBarrierattr?, shared: Int): Int
