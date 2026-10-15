// port-lint: source unix/linux_like/linux/gnu/b32/x86/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*

public data class UserRegsStruct(
    val ebx: Long,
    val ecx: Long,
    val edx: Long,
    val esi: Long,
    val edi: Long,
    val ebp: Long,
    val eax: Long,
    val xds: Long,
    val xes: Long,
    val xfs: Long,
    val xgs: Long,
    val origEax: Long,
    val eip: Long,
    val xcs: Long,
    val eflags: Long,
    val esp: Long,
    val xss: Long,
)
