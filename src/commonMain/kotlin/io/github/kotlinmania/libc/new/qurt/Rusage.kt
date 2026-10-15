// port-lint: source new/qurt/mod.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public data class Rusage(
    val ruUtime: Timeval,
    val ruStime: Timeval,
    val ruMaxrss: Long,
    val ruIxrss: Long,
    val ruIdrss: Long,
    val ruIsrss: Long,
    val ruMinflt: Long,
    val ruMajflt: Long,
    val ruNswap: Long,
    val ruInblock: Long,
    val ruOublock: Long,
    val ruMsgsnd: Long,
    val ruMsgrcv: Long,
    val ruNsignals: Long,
    val ruNvcsw: Long,
    val ruNivcsw: Long,
)
