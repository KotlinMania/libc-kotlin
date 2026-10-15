// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class EpollParams(
    val busyPollUsecs: UInt,
    val busyPollBudget: UShort,
    val preferBusyPoll: UByte,
    val pad: UByte,
)
