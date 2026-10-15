package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Devstat(
    val sequence0: UInt,
    val allocated: Int,
    val startCount: UInt,
    val endCount: UInt,
    val busyFrom: Bintime,
    val devLinks: CAnonymousStailqEntryDevstat,
    val deviceNumber: UInt,
    val deviceName: ByteArray,
    val unitNumber: Int,
    val bytes: ULongArray,
    val operations: ULongArray,
    val duration: List<Bintime>,
    val busyTime: Bintime,
    val creationTime: Bintime,
    val blockSize: UInt,
    val tagTypes: ULongArray,
    val flags: DevstatSupportFlags,
    val deviceType: DevstatTypeFlags,
    val priority: DevstatPriority,
    val id: COpaquePointer?,
    val sequence1: UInt,
)
