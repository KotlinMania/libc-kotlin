package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class Iwreq(
    val ifrIfrn: CAnonymousIwreq,
    val u: IwreqData,
)
