// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

internal enum class Nfsstat(
    val value: Int,
) {
    NFSERR_REMOTE(71),
    NFSERR_WFLUSH(99),
    NFSERR_BADHANDLE(10001),
    NFSERR_NOT_SYNC(10002),
    NFSERR_BAD_COOKIE(10003),
    NFSERR_TOOSMALL(10005),
    NFSERR_BADTYPE(10007),
    NFSERR_JUKEBOX(10008),
}
