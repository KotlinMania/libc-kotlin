@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun time(tloc: MutPtr): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeTime")

@kotlin.wasm.WasmImport("libc", "libcNewQurtTimeClock")
private external fun wasiLibcNewQurtTimeClock(): Long

public actual fun clock(): ClockT =
    wasiLibcNewQurtTimeClock()

@kotlin.wasm.WasmImport("libc", "libcNewQurtTimeDifftime")
private external fun wasiLibcNewQurtTimeDifftime(time1: Long, time0: Long): Double

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    wasiLibcNewQurtTimeDifftime(time1, time0)

public actual fun mktime(tm: MutPtr): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeMktime")

public actual fun gmtime(timep: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeGmtime")

public actual fun gmtimeR(timep: ConstPtr, result: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeGmtimeR")

public actual fun localtime(timep: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeLocaltime")

public actual fun localtimeR(timep: ConstPtr, result: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeLocaltimeR")

public actual fun asctime(tm: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeAsctime")

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeAsctimeR")

public actual fun ctime(timep: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeCtime")

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeCtimeR")

public actual fun strftime(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeStrftime")

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeStrptime")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeClockGettime")

public actual fun nanosleep(req: ConstPtr, rem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtTimeNanosleep")
