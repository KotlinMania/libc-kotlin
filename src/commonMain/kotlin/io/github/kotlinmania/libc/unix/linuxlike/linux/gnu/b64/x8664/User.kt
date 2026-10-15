// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public data class User(
    val regs: UserRegsStruct,
    val uFpvalid: Int,
    val i387: UserFpregsStruct,
    val uTsize: ULong,
    val uDsize: ULong,
    val uSsize: ULong,
    val startCode: ULong,
    val startStack: ULong,
    val signal: Long,
    val uAr0: UserRegsStruct?,
    val uFpstate: UserFpregsStruct?,
    val magic: ULong,
    val uComm: ByteArray,
    val uDebugreg: ULongArray,
)
