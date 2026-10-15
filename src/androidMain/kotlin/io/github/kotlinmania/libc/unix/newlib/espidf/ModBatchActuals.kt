// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom not available on Android host — use androidNative target for FFI")

public actual fun gethostname(name: String?, namelen: Long): Unit = throw UnsupportedOperationException("gethostname not available on Android host — use androidNative target for FFI")

public actual fun sendmsg(s: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg not available on Android host — use androidNative target for FFI")

public actual fun recvmsg(s: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg not available on Android host — use androidNative target for FFI")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")
