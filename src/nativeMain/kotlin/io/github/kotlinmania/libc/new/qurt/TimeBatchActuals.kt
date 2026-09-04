// port-lint: source Time.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun time(tloc: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("clock requires manual FFI bridge — not yet implemented")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime requires manual FFI bridge — not yet implemented")

public actual fun gmtime(timep: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime requires manual FFI bridge — not yet implemented")

public actual fun gmtimeR(timep: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires manual FFI bridge — not yet implemented")

public actual fun localtime(timep: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime requires manual FFI bridge — not yet implemented")

public actual fun localtimeR(timep: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires manual FFI bridge — not yet implemented")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctime(timep: TimeT?): String? =
    throw UnsupportedOperationException("ctime requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(timep: TimeT?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires manual FFI bridge — not yet implemented")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires manual FFI bridge — not yet implemented")

public actual fun nanosleep(req: Timespec?, rem: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep requires manual FFI bridge — not yet implemented")
