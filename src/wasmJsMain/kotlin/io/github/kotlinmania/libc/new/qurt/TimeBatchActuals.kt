// port-lint: source Time.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun time(tloc: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("clock requires N-API addon")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime requires N-API addon")

public actual fun gmtime(timep: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime requires N-API addon")

public actual fun gmtimeR(timep: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires N-API addon")

public actual fun localtime(timep: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime requires N-API addon")

public actual fun localtimeR(timep: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires N-API addon")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime requires N-API addon")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctime(timep: TimeT?): String? =
    throw UnsupportedOperationException("ctime requires N-API addon")

public actual fun ctimeR(timep: TimeT?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires N-API addon")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun nanosleep(req: Timespec?, rem: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep requires N-API addon")

