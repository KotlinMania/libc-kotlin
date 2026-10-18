package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XskTxMetadata(
    val flags: ULong,
    val xskTxMetadataUnion: CAnonymousXskTxMetadataUnion,
)
