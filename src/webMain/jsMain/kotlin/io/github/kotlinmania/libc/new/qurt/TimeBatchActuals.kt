// port-lint: source Time.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun time(tloc: Long?): Long =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun clock(): Long =
    throw UnsupportedOperationException("clock requires N-API addon")

public actual fun mktime(tm: Tm?): Long =
    throw UnsupportedOperationException("mktime requires N-API addon")

public actual fun gmtime(timep: Long?): Tm? =
    throw UnsupportedOperationException("gmtime requires N-API addon")

public actual fun gmtimeR(timep: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires N-API addon")

public actual fun localtime(timep: Long?): Tm? =
    throw UnsupportedOperationException("localtime requires N-API addon")

public actual fun localtimeR(timep: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires N-API addon")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime requires N-API addon")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctime(timep: Long?): String? =
    throw UnsupportedOperationException("ctime requires N-API addon")

public actual fun ctimeR(timep: Long?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires N-API addon")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun nanosleep(req: Timespec?, rem: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep requires N-API addon")
