// port-lint: source Time.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun time(tloc: Long?): Long =
    throw UnsupportedOperationException("time not available on WASI — no C library access")

public actual fun clock(): Long =
    throw UnsupportedOperationException("clock not available on WASI — no C library access")

public actual fun mktime(tm: Tm?): Long =
    throw UnsupportedOperationException("mktime not available on WASI — no C library access")

public actual fun gmtime(timep: Long?): Tm? =
    throw UnsupportedOperationException("gmtime not available on WASI — no C library access")

public actual fun gmtimeR(timep: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on WASI — no C library access")

public actual fun localtime(timep: Long?): Tm? =
    throw UnsupportedOperationException("localtime not available on WASI — no C library access")

public actual fun localtimeR(timep: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on WASI — no C library access")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime not available on WASI — no C library access")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on WASI — no C library access")

public actual fun ctime(timep: Long?): String? =
    throw UnsupportedOperationException("ctime not available on WASI — no C library access")

public actual fun ctimeR(timep: Long?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on WASI — no C library access")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on WASI — no C library access")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime not available on WASI — no C library access")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on WASI — no C library access")

public actual fun nanosleep(req: Timespec?, rem: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep not available on WASI — no C library access")
