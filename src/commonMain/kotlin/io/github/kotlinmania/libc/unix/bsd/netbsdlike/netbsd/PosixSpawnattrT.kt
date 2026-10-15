// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PosixSpawnattrT(
    val saFlags: Short,
    val saPgroup: Int,
    val saSchedparam: SchedParam,
    val saSchedpolicy: Int,
    val saSigdefault: SigsetT,
    val saSigmask: SigsetT,
)
