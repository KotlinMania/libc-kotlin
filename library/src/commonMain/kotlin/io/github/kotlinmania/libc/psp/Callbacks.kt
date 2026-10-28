package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.COpaquePointer

public fun interface GraphicsCallback {
    public operator fun invoke(event: Int, context: COpaquePointer?): Unit
}

public fun interface ThreadEntry {
    public operator fun invoke(argumentSize: ULong, arguments: COpaquePointer?): Int
}

public fun interface VTimerHandler {
    public operator fun invoke(timer: SceUid, scheduled: SceKernelSysClock?, actual: SceKernelSysClock?, context: COpaquePointer?): UInt
}

public fun interface ThreadEventHandler {
    public operator fun invoke(event: Int, thread: SceUid, context: COpaquePointer?): Int
}

public fun interface AlarmHandler {
    public operator fun invoke(context: COpaquePointer?): UInt
}

public fun interface KernelCallback {
    public operator fun invoke(count: Int, argument: Int, context: COpaquePointer?): Int
}

public fun interface MpegRingbufferCallback {
    public operator fun invoke(data: COpaquePointer?, packets: Int, context: COpaquePointer?): Int
}
