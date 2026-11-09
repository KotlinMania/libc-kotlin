@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT

private object NewQurtTimeJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_time_time(tloc: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_clock(): Long

    @JvmStatic
    external fun libc_new_qurt_time_difftime(time1: Long, time0: Long): Double

    @JvmStatic
    external fun libc_new_qurt_time_mktime(tm: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_gmtime(timep: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_gmtimeR(timep: Long, result: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_localtime(timep: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_localtimeR(timep: Long, result: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_asctime(tm: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_asctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_ctime(timep: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_ctimeR(timep: Long, buf: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_strftime(s: Long, maxsize: Long, format: String?, timeptr: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_strptime(s: String?, format: String?, tm: Long): Long

    @JvmStatic
    external fun libc_new_qurt_time_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_new_qurt_time_nanosleep(req: Long, rem: Long): Int
}

public actual fun time(tloc: COpaquePointer?): TimeT =
    NewQurtTimeJniBridge.libc_new_qurt_time_time((tloc?.value ?: 0L))

public actual fun clock(): ClockT =
    NewQurtTimeJniBridge.libc_new_qurt_time_clock()

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    NewQurtTimeJniBridge.libc_new_qurt_time_difftime(time1, time0)

public actual fun mktime(tm: COpaquePointer?): TimeT =
    NewQurtTimeJniBridge.libc_new_qurt_time_mktime((tm?.value ?: 0L))

public actual fun gmtime(timep: COpaquePointer?): COpaquePointer? =
    NewQurtTimeJniBridge.libc_new_qurt_time_gmtime((timep?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gmtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    NewQurtTimeJniBridge.libc_new_qurt_time_gmtimeR((timep?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtime(timep: COpaquePointer?): COpaquePointer? =
    NewQurtTimeJniBridge.libc_new_qurt_time_localtime((timep?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    NewQurtTimeJniBridge.libc_new_qurt_time_localtimeR((timep?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    NewQurtTimeJniBridge.libc_new_qurt_time_asctime((tm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    NewQurtTimeJniBridge.libc_new_qurt_time_asctimeR((tm?.value ?: 0L), (buf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctime(timep: COpaquePointer?): COpaquePointer? =
    NewQurtTimeJniBridge.libc_new_qurt_time_ctime((timep?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    NewQurtTimeJniBridge.libc_new_qurt_time_ctimeR((timep?.value ?: 0L), (buf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    NewQurtTimeJniBridge.libc_new_qurt_time_strftime((s?.value ?: 0L), maxsize.toLong(), format, (timeptr?.value ?: 0L)).toULong()

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    NewQurtTimeJniBridge.libc_new_qurt_time_strptime(s, format, (tm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    NewQurtTimeJniBridge.libc_new_qurt_time_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun nanosleep(req: COpaquePointer?, rem: COpaquePointer?): CInt =
    NewQurtTimeJniBridge.libc_new_qurt_time_nanosleep((req?.value ?: 0L), (rem?.value ?: 0L))
