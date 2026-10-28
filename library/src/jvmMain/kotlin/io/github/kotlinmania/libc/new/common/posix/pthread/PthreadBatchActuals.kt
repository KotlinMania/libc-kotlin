package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrGetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetinheritsched not available on JVM — no C library access")

public actual fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedparam not available on JVM — no C library access")

public actual fun pthreadAttrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedpolicy not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrSetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched not available on JVM — no C library access")

public actual fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedparam not available on JVM — no C library access")

public actual fun pthreadAttrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy not available on JVM — no C library access")

public actual fun pthreadAttrSetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on JVM — no C library access")

public actual fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?, count: UInt): Int =
    throw UnsupportedOperationException("pthreadBarrierInit not available on JVM — no C library access")

public actual fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared not available on JVM — no C library access")

public actual fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int): Int =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared not available on JVM — no C library access")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on JVM — no C library access")

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetpshared not available on JVM — no C library access")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on JVM — no C library access")

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetpshared not available on JVM — no C library access")

public actual fun pthreadGetcpuclockid(thread: ULong, clkId: Int?): Int =
    throw UnsupportedOperationException("pthreadGetcpuclockid not available on JVM — no C library access")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam not available on JVM — no C library access")

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on JVM — no C library access")

public actual fun pthreadMutexattrGetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol not available on JVM — no C library access")

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared not available on JVM — no C library access")

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robustness: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust not available on JVM — no C library access")

public actual fun pthreadMutexattrSetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol not available on JVM — no C library access")

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on JVM — no C library access")

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robustness: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on JVM — no C library access")

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared not available on JVM — no C library access")

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared not available on JVM — no C library access")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam not available on JVM — no C library access")

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on JVM — no C library access")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on JVM — no C library access")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on JVM — no C library access")

public actual fun pthreadOnce(control: Int?, routine: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadOnce not available on JVM — no C library access")
