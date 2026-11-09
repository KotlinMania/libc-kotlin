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

private val _newQurtTimeNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun time(tloc: COpaquePointer?): TimeT =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_time((tloc?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun clock(): ClockT =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_clock() as String).toLong() else 0L

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_difftime(time1.toString(), time0.toString()) as Double) else 0.0

public actual fun mktime(tm: COpaquePointer?): TimeT =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_mktime((tm?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun gmtime(timep: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_gmtime((timep?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun gmtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_gmtimeR((timep?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun localtime(timep: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_localtime((timep?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun localtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_localtimeR((timep?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_asctime((tm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ctime(timep: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_ctime((timep?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_ctimeR((timep?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_strftime((s?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_strptime(s, format, (tm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun nanosleep(req: COpaquePointer?, rem: COpaquePointer?): CInt =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_nanosleep((req?.value ?: 0L).toString(), (rem?.value ?: 0L).toString()) as Int) else 0
