package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class PosixSpawnattrT(
    val posixAttrFlags: Short,
    val posixAttrPgroup: Int,
    val posixAttrSigmask: SigsetT,
    val posixAttrSigdefault: SigsetT,
    val posixAttrSchedpolicy: Int,
    val posixAttrSchedparam: SchedParam,
)
