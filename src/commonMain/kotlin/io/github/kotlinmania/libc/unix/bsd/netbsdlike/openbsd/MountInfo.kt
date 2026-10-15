package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class MountInfo(
    val ufsArgs: UfsArgs? = null,
    val mfsArgs: MfsArgs? = null,
    val nfsArgs: NfsArgs? = null,
    val isoArgs: IsoArgs? = null,
    val msdosfsArgs: MsdosfsArgs? = null,
    val ntfsArgs: NtfsArgs? = null,
    val tmpfsArgs: TmpfsArgs? = null,
    val align: ByteArray? = null,
)
