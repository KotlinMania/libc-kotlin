// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom not available on JVM — no C library access")

public actual fun gethostname(name: String?, namelen: SsizeT) {
    throw UnsupportedOperationException("gethostname not available on JVM — no C library access")
}

public actual fun sendmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg not available on JVM — no C library access")

public actual fun recvmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg not available on JVM — no C library access")

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd not available on JVM — no C library access")

