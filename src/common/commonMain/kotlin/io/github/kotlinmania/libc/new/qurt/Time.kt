// port-lint: source new/qurt/time.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.LibcDynamicFfi

// Header: `time.h`

// Clock types
public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 2

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 3

public fun time(tloc: TimeT?): TimeT {
    val __slot_0 = if (tloc == null) 0L else LibcDynamicFfi.allocScalarSlot(tloc)
    try {
        return LibcDynamicFfi.invoke("time", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun clock(): ClockT {
    return LibcDynamicFfi.invoke("clock", -1, longArrayOf())
}

public fun difftime(time1: TimeT, time0: TimeT): CDouble {
    return LibcDynamicFfi.invokeFp("difftime", 0, false, longArrayOf(time1, time0))
}

public fun mktime(tm: Tm?): TimeT {
    return LibcDynamicFfi.invoke("mktime", -1, longArrayOf(tm?.value ?: 0L))
}

public fun gmtime(timep: TimeT?): Tm? {
    val __slot_0 = if (timep == null) 0L else LibcDynamicFfi.allocScalarSlot(timep)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun gmtimeR(timep: TimeT?, result: Tm?): Tm? {
    val __slot_0 = if (timep == null) 0L else LibcDynamicFfi.allocScalarSlot(timep)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime_r", -1, longArrayOf(__slot_0, result?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtime(timep: TimeT?): Tm? {
    val __slot_0 = if (timep == null) 0L else LibcDynamicFfi.allocScalarSlot(timep)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtimeR(timep: TimeT?, result: Tm?): Tm? {
    val __slot_0 = if (timep == null) 0L else LibcDynamicFfi.allocScalarSlot(timep)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime_r", -1, longArrayOf(__slot_0, result?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun asctime(tm: Tm?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("asctime", -1, longArrayOf(tm?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("asctime_r", -1, longArrayOf(tm?.value ?: 0L, buf?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ctime(timep: TimeT?): COpaquePointer? {
    val __slot_0 = if (timep == null) 0L else LibcDynamicFfi.allocScalarSlot(timep)
    try {
        val rawRet = LibcDynamicFfi.invoke("ctime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer? {
    val __slot_0 = if (timep == null) 0L else LibcDynamicFfi.allocScalarSlot(timep)
    try {
        val rawRet = LibcDynamicFfi.invoke("ctime_r", -1, longArrayOf(__slot_0, buf?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("strftime", -1, longArrayOf(s?.value ?: 0L, maxsize.toLong(), __cstr_2, timeptr?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        val rawRet = LibcDynamicFfi.invoke("strptime", -1, longArrayOf(__cstr_0, __cstr_1, tm?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun nanosleep(req: Timespec?, rem: Timespec?): CInt {
    return LibcDynamicFfi.invoke("nanosleep", -1, longArrayOf(req?.value ?: 0L, rem?.value ?: 0L)).toInt()
}
