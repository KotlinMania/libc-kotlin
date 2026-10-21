package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.new.apple.libpthread.pthread.PthreadIntrospectionHook
import io.github.kotlinmania.libc.psp.AlarmHandler
import io.github.kotlinmania.libc.psp.GeCallbackData
import io.github.kotlinmania.libc.psp.GraphicsCallback
import io.github.kotlinmania.libc.psp.KernelCallback
import io.github.kotlinmania.libc.psp.MpegRingbufferCallback
import io.github.kotlinmania.libc.psp.SceKernelSysClock
import io.github.kotlinmania.libc.psp.SceUid
import io.github.kotlinmania.libc.psp.ThreadEntry
import io.github.kotlinmania.libc.psp.ThreadEventHandler
import io.github.kotlinmania.libc.psp.VTimerHandler
import io.github.kotlinmania.libc.unix.aix.FileClose
import io.github.kotlinmania.libc.unix.aix.FileIoctl
import io.github.kotlinmania.libc.unix.aix.FileReadWrite
import io.github.kotlinmania.libc.unix.aix.FileSelect
import io.github.kotlinmania.libc.unix.aix.FileSelectNotification
import io.github.kotlinmania.libc.unix.aix.FileStat
import io.github.kotlinmania.libc.unix.aix.FileopsT
import io.github.kotlinmania.libc.unix.aix.UioRw
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneAllocate
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneBatchAllocate
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneBatchFree
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneCalloc
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneClaimedAddress
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneDestroy
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneFree
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneFreeDefiniteSize
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneMemalign
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZonePressureRelief
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneReallocate
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneSize
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneValloc
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664.CAnonymousElf64AuxvUnion
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.DiagnosticHandler
import io.github.kotlinmania.libc.unix.haiku.ImageInitializer
import io.github.kotlinmania.libc.unix.haiku.ImageTerminator
import io.github.kotlinmania.libc.unix.nto.GlobErrorHandler
import io.github.kotlinmania.libc.unix.nto.ThreadExitHandler
import io.github.kotlinmania.libc.vxworks.SaUT
import io.github.kotlinmania.libc.vxworks.TerminatingSignalAction
import io.github.kotlinmania.libc.vxworks.TerminatingSignalHandler
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertSame

class CallbackContractsTest {
    @Test
    fun allocatorRecordPreservesCallbackIdentityAndUnsignedArguments() {
        val pointer = COpaquePointer(0x100000001L)
        val allocationSize = ULong.MAX_VALUE - 7uL
        var observedSize = 0uL
        val allocate =
            MallocZoneAllocate { zone, size ->
                assertNull(zone)
                observedSize = size
                pointer
            }
        val zone = emptyZone().copy(malloc = allocate)
        assertSame(allocate, zone.malloc)
        assertSame(pointer, zone.malloc?.invoke(null, allocationSize))
        assertEquals(allocationSize, observedSize)
        assertSame(allocate, zone.copy(zoneName = "copied").malloc)
        assertNull(zone.free)
        assertNull(zone.copy(malloc = null).malloc)
    }

    @Test
    fun batchCallbacksForwardZonePointerArrayAndFullWidthCount() {
        val pointers = COpaquePointer(0x100000003L)
        val zone = emptyZone()
        var freedCount = 0u
        val free =
            MallocZoneBatchFree { receivedZone, receivedPointers, count ->
                assertSame(zone, receivedZone)
                assertSame(pointers, receivedPointers)
                freedCount = count
            }
        val allocate =
            MallocZoneBatchAllocate { receivedZone, size, results, count ->
                assertSame(zone, receivedZone)
                assertEquals(ULong.MAX_VALUE, size)
                assertSame(pointers, results)
                count - 1u
            }
        free(zone, pointers, UInt.MAX_VALUE)
        assertEquals(UInt.MAX_VALUE, freedCount)
        assertEquals(UInt.MAX_VALUE - 1u, allocate(zone, ULong.MAX_VALUE, pointers, UInt.MAX_VALUE))
    }

    @Test
    fun allocatorHooksKeepDistinctAllocationAlignmentAndLifecycleValues() {
        val pointer = COpaquePointer(0x100000005L)
        val events = mutableListOf<String>()
        val zone =
            emptyZone().copy(
                size =
                    MallocZoneSize { _, actual ->
                        assertSame(pointer, actual)
                        ULong.MAX_VALUE
                    },
                calloc =
                    MallocZoneCalloc { _, count, size ->
                        assertEquals(3uL, count)
                        assertEquals(7uL, size)
                        pointer
                    },
                valloc =
                    MallocZoneValloc { _, size ->
                        assertEquals(21uL, size)
                        pointer
                    },
                free =
                    MallocZoneFree { _, actual ->
                        assertSame(pointer, actual)
                        events.add("free")
                    },
                realloc =
                    MallocZoneReallocate { _, actual, size ->
                        assertSame(pointer, actual)
                        assertEquals(42uL, size)
                        null
                    },
                destroy =
                    MallocZoneDestroy { actual ->
                        assertNull(actual)
                        events.add("destroy")
                    },
                memalign =
                    MallocZoneMemalign { _, alignment, size ->
                        assertEquals(64uL, alignment)
                        assertEquals(21uL, size)
                        pointer
                    },
                freeDefiniteSize =
                    MallocZoneFreeDefiniteSize { _, actual, size ->
                        assertSame(pointer, actual)
                        assertEquals(21uL, size)
                        events.add("sized")
                    },
                pressureRelief = MallocZonePressureRelief { _, goal -> goal - 1uL },
                claimedAddress =
                    MallocZoneClaimedAddress { _, actual ->
                        assertSame(pointer, actual)
                        UInt.MAX_VALUE
                    },
            )
        assertEquals(ULong.MAX_VALUE, zone.size?.invoke(null, pointer))
        assertSame(pointer, zone.calloc?.invoke(null, 3uL, 7uL))
        assertSame(pointer, zone.valloc?.invoke(null, 21uL))
        assertNull(zone.realloc?.invoke(null, pointer, 42uL))
        assertSame(pointer, zone.memalign?.invoke(null, 64uL, 21uL))
        assertEquals(ULong.MAX_VALUE - 1uL, zone.pressureRelief?.invoke(null, ULong.MAX_VALUE))
        assertEquals(UInt.MAX_VALUE, zone.claimedAddress?.invoke(null, pointer))
        zone.freeDefiniteSize?.invoke(null, pointer, 21uL)
        zone.free?.invoke(null, pointer)
        zone.destroy?.invoke(null)
        assertEquals(listOf("sized", "free", "destroy"), events)
    }

    @Test
    fun fileCallbacksPreserveTypedOperationsAndNestedNotification() {
        val pointer = COpaquePointer(17L)
        val events = mutableListOf<String>()
        val operations =
            FileopsT(
                foRw =
                    FileReadWrite { file, operation, buffer, size, context ->
                        assertNull(file)
                        assertEquals(UioRw.UIO_PWRITE, operation)
                        assertSame(pointer, buffer)
                        assertEquals(Long.MAX_VALUE, size)
                        assertNull(context)
                        -7
                    },
                foIoctl =
                    FileIoctl { file, command, argument, flags, extension ->
                        assertNull(file)
                        assertEquals(Long.MIN_VALUE, command)
                        assertNull(argument)
                        assertEquals(11L, flags)
                        assertEquals(13L, extension)
                        -9
                    },
                foSelect =
                    FileSelect { file, mask, returned, notify ->
                        assertNull(file)
                        assertEquals(5, mask)
                        assertEquals(3u.toUShort(), returned)
                        events.add("select")
                        notify?.invoke()
                        events.add("complete")
                        19
                    },
                foClose =
                    FileClose { file ->
                        assertNull(file)
                        -11
                    },
                foFstat =
                    FileStat { file, stat ->
                        assertNull(file)
                        assertNull(stat)
                        -13
                    },
            )
        assertEquals(-7, operations.foRw?.invoke(null, UioRw.UIO_PWRITE, pointer, Long.MAX_VALUE, null))
        assertEquals(-9, operations.foIoctl?.invoke(null, Long.MIN_VALUE, null, 11L, 13L))
        val notify = FileSelectNotification { events.add("notify") }
        assertEquals(19, operations.foSelect?.invoke(null, 5, 3u.toUShort(), notify))
        assertEquals(listOf("select", "notify", "complete"), events)
        assertEquals(-11, operations.foClose?.invoke(null))
        assertEquals(-13, operations.foFstat?.invoke(null, null))
    }

    @Test
    fun diagnosticHandlerPreservesSignedStatusAndNullableMessage() {
        val messages = mutableListOf<String?>()
        val handler =
            DiagnosticHandler { status, message ->
                assertEquals(-5, status)
                messages.add(message)
            }
        handler(-5, null)
        handler(-5, "detail")
        assertEquals(listOf(null, "detail"), messages)
    }

    @Test
    fun nonReturningSignalCallbacksPropagateTheOriginalFailure() {
        val failure = IllegalStateException("signal completion")
        val pointer = COpaquePointer(23L)
        val handlers =
            SaUT(
                saHandler =
                    TerminatingSignalHandler { signal ->
                        assertEquals(7, signal)
                        throw failure
                    },
                saSigaction =
                    TerminatingSignalAction { signal, info, context ->
                        assertEquals(9, signal)
                        assertNull(info)
                        assertSame(pointer, context)
                        throw failure
                    },
            )
        assertSame(failure, assertFailsWith<IllegalStateException> { handlers.saHandler?.invoke(7) })
        assertSame(failure, assertFailsWith<IllegalStateException> { handlers.saSigaction?.invoke(9, null, pointer) })
    }

    @Test
    fun graphicsAndTimerCallbacksKeepContextAndConcreteClockTypes() {
        val pointer = COpaquePointer(29L)
        val observed = mutableListOf<Int>()
        val callback =
            GraphicsCallback { event, context ->
                assertSame(pointer, context)
                observed.add(event)
            }
        val data = GeCallbackData(callback, pointer, callback, pointer)
        assertSame(data.signalFunc, data.finishFunc)
        data.signalFunc?.invoke(3, data.signalArg)
        data.finishFunc?.invoke(5, data.finishArg)
        assertEquals(listOf(3, 5), observed)
        val scheduled = SceKernelSysClock(UInt.MAX_VALUE, 7u)
        val timer = SceUid(-19)
        val handler =
            VTimerHandler { id, clock, actual, context ->
                assertSame(timer, id)
                assertSame(scheduled, clock)
                assertNull(actual)
                assertSame(pointer, context)
                UInt.MAX_VALUE
            }
        assertEquals(UInt.MAX_VALUE, handler(timer, scheduled, null, pointer))
    }

    @Test
    fun kernelCallbacksRetainSignedResultsAndNullablePointers() {
        val pointer = COpaquePointer(31L)
        val thread = SceUid(-3)
        val entry =
            ThreadEntry { size, args ->
                assertEquals(ULong.MAX_VALUE, size)
                assertSame(pointer, args)
                Int.MIN_VALUE
            }
        val event =
            ThreadEventHandler { code, id, context ->
                assertEquals(-5, code)
                assertSame(thread, id)
                assertNull(context)
                -7
            }
        val alarm =
            AlarmHandler { context ->
                assertNull(context)
                UInt.MAX_VALUE
            }
        val callback =
            KernelCallback { count, argument, context ->
                assertEquals(11, count)
                assertEquals(-13, argument)
                assertSame(pointer, context)
                -17
            }
        val ring =
            MpegRingbufferCallback { data, packets, context ->
                assertSame(pointer, data)
                assertEquals(19, packets)
                assertNull(context)
                -23
            }
        assertEquals(Int.MIN_VALUE, entry(ULong.MAX_VALUE, pointer))
        assertEquals(-7, event(-5, thread, null))
        assertEquals(UInt.MAX_VALUE, alarm(null))
        assertEquals(-17, callback(11, -13, pointer))
        assertEquals(-23, ring(pointer, 19, null))
    }

    @Test
    fun signalNotificationsRetainTheirConcretePayloads() {
        val pointer = COpaquePointer(37L)
        val value =
            io.github.kotlinmania.libc.unix
                .Sigval(pointer)
        val notify =
            io.github.kotlinmania.libc.unix
                .SignalNotification { actual -> assertSame(value, actual) }
        notify(value)
        val qurtValue =
            io.github.kotlinmania.libc.new.qurt
                .Sigval(-3, pointer)
        val qurtNotify =
            io.github.kotlinmania.libc.new.qurt
                .SignalNotification { actual -> assertSame(qurtValue, actual) }
        val qurtAction =
            io.github.kotlinmania.libc.new.qurt.SignalAction { signal, info, context ->
                assertEquals(7, signal)
                assertNull(info)
                assertSame(pointer, context)
            }
        qurtNotify(qurtValue)
        qurtAction(7, null, pointer)
        val signal = SignalHandler { actual -> assertEquals(-11, actual) }
        signal(-11)
    }

    @Test
    fun lifecycleAndInspectionHooksPreserveInvocationAndFailureContracts() {
        val pointer = COpaquePointer(41L)
        val events = mutableListOf<String>()
        val restorer = SignalRestorer { events.add("restore") }
        val auxiliary = CAnonymousElf64AuxvUnion(aFcn = { events.add("auxiliary") })
        val initialize = ImageInitializer { events.add("initialize") }
        val terminate = ImageTerminator { events.add("terminate") }
        restorer()
        auxiliary.aFcn?.invoke()
        initialize()
        terminate()
        assertEquals(listOf("restore", "auxiliary", "initialize", "terminate"), events)
        val introspection =
            PthreadIntrospectionHook { event, thread, address, size ->
                assertEquals(UInt.MAX_VALUE, event)
                assertEquals(ULong.MAX_VALUE, thread)
                assertSame(pointer, address)
                assertEquals(ULong.MAX_VALUE - 1uL, size)
            }
        introspection(UInt.MAX_VALUE, ULong.MAX_VALUE, pointer, ULong.MAX_VALUE - 1uL)
        val coroutine =
            io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.ContextCoroutine { context, argument ->
                assertNull(context)
                assertSame(pointer, argument)
            }
        coroutine(null, pointer)
        val exit = ThreadExitHandler { value -> assertSame(pointer, value) }
        val glob =
            GlobErrorHandler { path, error ->
                assertNull(path)
                error
            }
        exit(pointer)
        assertEquals(-47, glob(null, -47))
        val failure = IllegalStateException("notify")
        val notification = FileSelectNotification { throw failure }
        assertSame(failure, assertFailsWith<IllegalStateException> { notification() })
    }

    private fun emptyZone(): MallocZoneT =
        MallocZoneT(
            size = null,
            malloc = null,
            calloc = null,
            valloc = null,
            free = null,
            realloc = null,
            destroy = null,
            zoneName = null,
            batchMalloc = null,
            batchFree = null,
            introspect = null,
            version = 0u,
            memalign = null,
            freeDefiniteSize = null,
            pressureRelief = null,
            claimedAddress = null,
        )
}
