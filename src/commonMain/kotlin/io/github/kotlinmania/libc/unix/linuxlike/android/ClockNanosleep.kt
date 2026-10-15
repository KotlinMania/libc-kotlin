// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int
