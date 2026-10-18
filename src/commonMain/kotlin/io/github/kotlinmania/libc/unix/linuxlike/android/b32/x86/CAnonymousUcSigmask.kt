package io.github.kotlinmania.libc.unix.linuxlike.android.b32.x86
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.Sigset64T

// C union; only one variant is valid at a time.
public data class CAnonymousUcSigmask(
    val ucSigmask: CAnonymousUcSigmaskWithPadding? = null,
    val ucSigmask64: Sigset64T? = null,
)
