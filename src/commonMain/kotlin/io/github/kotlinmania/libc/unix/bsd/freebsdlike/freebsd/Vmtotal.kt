// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Vmtotal(
    val tVm: ULong,
    val tAvm: ULong,
    val tRm: ULong,
    val tArm: ULong,
    val tVmshr: ULong,
    val tAvmshr: ULong,
    val tRmshr: ULong,
    val tArmshr: ULong,
    val tFree: ULong,
    val tRq: Short,
    val tDw: Short,
    val tPw: Short,
    val tSl: Short,
    val tSw: Short,
    val tPad: UShortArray,
)
