package io.github.kotlinmania.libc.unix.linuxlike.android.b64.x8664

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
    val errorCode: ULong,
    val faultAddress: ULong,
)
