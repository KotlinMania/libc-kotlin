// port-lint: source unix/linux_like/android/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64.x8664

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousUcSigmask(
    val ucSigmask: ULong? = null,
    val ucSigmask64: Sigset64T? = null,
)
