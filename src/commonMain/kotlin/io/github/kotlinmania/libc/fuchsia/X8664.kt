// port-lint: source fuchsia/x86_64.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class McontextT(
    val private: ULongArray,
)

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask: SigsetT,
    val private: UByteArray,
)

public const val R15: Int = 0
public const val R14: Int = 1
public const val R13: Int = 2
public const val R12: Int = 3
public const val RBP: Int = 4
public const val RBX: Int = 5
public const val R11: Int = 6
public const val R10: Int = 7
public const val R9: Int = 8
public const val R8: Int = 9
public const val RAX: Int = 10
public const val RCX: Int = 11
public const val RDX: Int = 12
public const val RSI: Int = 13
public const val RDI: Int = 14
public const val ORIG_RAX: Int = 15
public const val RIP: Int = 16
public const val CS: Int = 17
public const val EFLAGS: Int = 18
public const val RSP: Int = 19
public const val SS: Int = 20
public const val FS_BASE: Int = 21
public const val GS_BASE: Int = 22
public const val DS: Int = 23
public const val ES: Int = 24
public const val FS: Int = 25
public const val GS: Int = 26
public const val MAP_32BIT: Int = 0x0040
