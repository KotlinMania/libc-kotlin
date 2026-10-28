package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Filestat(
    val fsType: Int,
    val fsFlags: Int,
    val fsFflags: Int,
    val fsUflags: Int,
    val fsFd: Int,
    val fsRefCount: Int,
    val fsOffset: Long,
    val fsTypedep: COpaquePointer?,
    val fsPath: String?,
    val next: CAnonymousFilestat,
    val fsCapRights: CapRightsT,
)
