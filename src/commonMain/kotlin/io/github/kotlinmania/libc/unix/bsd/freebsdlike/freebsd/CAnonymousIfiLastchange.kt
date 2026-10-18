package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

// C union; only one variant is valid at a time.
public data class CAnonymousIfiLastchange(
    val tv: Timeval? = null,
    val ph: CAnonymousPh? = null,
)
