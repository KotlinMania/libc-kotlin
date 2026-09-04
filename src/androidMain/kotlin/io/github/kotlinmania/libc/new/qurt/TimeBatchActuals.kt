// port-lint: source Time.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun time(tloc: TimeT?): TimeT =
    throw UnsupportedOperationException("time not available on Android host — use androidNative target for FFI")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("clock not available on Android host — use androidNative target for FFI")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime not available on Android host — use androidNative target for FFI")

public actual fun gmtime(timep: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime not available on Android host — use androidNative target for FFI")

public actual fun gmtimeR(timep: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on Android host — use androidNative target for FFI")

public actual fun localtime(timep: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime not available on Android host — use androidNative target for FFI")

public actual fun localtimeR(timep: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on Android host — use androidNative target for FFI")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime not available on Android host — use androidNative target for FFI")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on Android host — use androidNative target for FFI")

public actual fun ctime(timep: TimeT?): String? =
    throw UnsupportedOperationException("ctime not available on Android host — use androidNative target for FFI")

public actual fun ctimeR(timep: TimeT?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on Android host — use androidNative target for FFI")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on Android host — use androidNative target for FFI")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime not available on Android host — use androidNative target for FFI")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on Android host — use androidNative target for FFI")

public actual fun nanosleep(req: Timespec?, rem: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep not available on Android host — use androidNative target for FFI")

