// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public data class UserRegsStruct(
    val r15: ULong,
    val r14: ULong,
    val r13: ULong,
    val r12: ULong,
    val rbp: ULong,
    val rbx: ULong,
    val r11: ULong,
    val r10: ULong,
    val r9: ULong,
    val r8: ULong,
    val rax: ULong,
    val rcx: ULong,
    val rdx: ULong,
    val rsi: ULong,
    val rdi: ULong,
    val origRax: ULong,
    val rip: ULong,
    val cs: ULong,
    val eflags: ULong,
    val rsp: ULong,
    val ss: ULong,
    val fsBase: ULong,
    val gsBase: ULong,
    val ds: ULong,
    val es: ULong,
    val fs: ULong,
    val gs: ULong,
)
