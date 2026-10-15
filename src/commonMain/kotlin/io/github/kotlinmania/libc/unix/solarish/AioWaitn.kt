// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun aioWaitn(aiocbList: COpaquePointer?, nent: UInt, nwait: UInt?, timeout: Timespec?): Int
