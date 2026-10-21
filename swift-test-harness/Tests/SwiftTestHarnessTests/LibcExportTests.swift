import Darwin
import Foundation
import Testing
import Libc

@Suite("Libc Export Smoke Tests")
struct LibcExportTests {
    @Test("Real allocation, descriptor IO and typed fcntl preserve bytes and errno")
    func testRealDescriptorIo() throws {
        typealias Unix = ExportedKotlinPackages.io.github.kotlinmania.libc.unix
        let source = try #require(Unix.malloc(size: 64))
        let destination = try #require(Unix.calloc(nobj: 64, size: 1))
        defer {
            Unix.free(p: source)
            Unix.free(p: destination)
        }
        #expect(Unix.memset(dest: source, c: 171, n: 64)?.value == source.value)
        #expect(Unix.memcmp(cx: source, ct: destination, n: 64) != 0)
        let flags = Unix.fileOpenFlags()
        let commands = try #require(Unix.descriptorCommands())
        let outputDirectory = ProcessInfo.processInfo.environment["LIBC_SWIFT_TEST_OUTPUT_ROOT"] ?? "../build"
        let path = "\(outputDirectory)/swift-io-\(UUID().uuidString).bin"
        let fd = Unix.open(path: path, oflag: flags.readWrite | flags.create | flags.truncate, mode: 0o600)
        #expect(fd >= 0)
        guard fd >= 0 else { return }
        defer {
            #expect(Unix.close(fd: fd) == 0)
            #expect(Unix.unlink(c: path) == 0)
        }
        #expect(Unix.write(fd: fd, buf: source, count: 64) == 64)
        #expect(Unix.lseek(fd: fd, offset: 0, whence: flags.seekStart) == 0)
        #expect(Unix.read(fd: fd, buf: destination, count: 64) == 64)
        #expect(Unix.memcmp(cx: source, ct: destination, n: 64) == 0)
        #expect(Unix.read(fd: fd, buf: destination, count: 1) == 0)
        let original = Unix.fcntl(fd: fd, cmd: commands.getFlags)
        #expect(original >= 0)
        #expect(Unix.fcntl(fd: fd, cmd: commands.setFlags, argument: original | commands.closeOnExec) == 0)
        #expect(Unix.fcntl(fd: fd, cmd: commands.getFlags) & commands.closeOnExec != 0)
        #expect(Unix.fcntl(fd: -1, cmd: commands.getFlags, argument: Optional<ExportedKotlinPackages.io.github.kotlinmania.libc.COpaquePointer>.none) == -1)
        #expect(Unix.lastErrorNumber() == commands.badDescriptor)
    }

    @Test("Named diagnostic callback preserves nullable messages through Kotlin")
    func testDiagnosticCallbackRoundTrip() {
        typealias NetBSD = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
        var messages: [String?] = []
        let callback = NetBSD.diagnosticHandler(function: { status, message in
            #expect(status == -7)
            messages.append(message)
        })
        callback(status: -7, message: nil)
        callback(status: -7, message: "callback detail")
        #expect(messages.count == 2)
        #expect(messages[0] == nil)
        #expect(messages[1] == "callback detail")
    }

    @Test("Named batch-free callback preserves its zone, pointer and full-width count")
    func testBatchFreeCallbackRoundTrip() throws {
        typealias Unix = ExportedKotlinPackages.io.github.kotlinmania.libc.unix
        typealias Allocator = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664
        let pointers = try #require(Unix.calloc(nobj: 2, size: 8))
        defer { Unix.free(p: pointers) }
        var observedZone: Allocator.MallocZoneT?
        defer { observedZone = nil }
        var observedPointer: Int64?
        var observedCount: UInt32?
        var calls = 0
        let callback = Allocator.mallocZoneBatchFree(function: { zone, address, count in
            observedZone = zone
            observedPointer = address?.value
            observedCount = count
            calls += 1
        })
        let zone = Allocator.MallocZoneT(
            size: nil, malloc: nil, calloc: nil, valloc: nil, free: nil,
            realloc: nil, destroy: nil, zoneName: nil, batchMalloc: nil,
            batchFree: callback, introspect: nil, version: 1, memalign: nil,
            freeDefiniteSize: nil, pressureRelief: nil, claimedAddress: nil
        )
        let stored = try #require(zone.batchFree)
        stored(zone: zone, pointers: pointers, count: UInt32.max)
        #expect(observedZone === zone)
        #expect(observedPointer == pointers.value)
        #expect(observedCount == UInt32.max)
        #expect(calls == 1)
    }

    @Test("Swift module loads cleanly")
    func testSwiftModuleLoads() throws {
        #expect(ExportedKotlinPackages.io.github.kotlinmania.libc.hermit.AF_INET == 3)
        #expect(ExportedKotlinPackages.io.github.kotlinmania.libc.hermit.AF_INET6 == 1)
        #expect(ExportedKotlinPackages.io.github.kotlinmania.libc.hermit.CLOCK_REALTIME == 1)
        #expect(ExportedKotlinPackages.io.github.kotlinmania.libc.trusty.CLOCK_BOOTTIME == 7)
    }

    @Test("Card enum values survive Swift export")
    func testParityEnums() {
        typealias Apple = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.apple
        typealias FreeBSD = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
        #expect(Apple.SysdirSearchPathDirectoryT.SYSDIR_DIRECTORY_ALL_APPLICATIONS.value == 100)
        #expect(Apple.SysdirSearchPathDomainMaskT.SYSDIR_DOMAIN_MASK_ALL.value == 0xffff)
        #expect(FreeBSD.DevstatTypeFlags.DEVSTAT_TYPE_IF_SCSI.value == 0x10)
        #expect(FreeBSD.DevstatPriority.DEVSTAT_PRIORITY_MAX.value == 0xfff)
    }

    @Test("Card ioctl encoding survives Swift export")
    func testParityIoctl() {
        typealias NetBSDLike = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.netbsdlike
        #expect(NetBSDLike.ioR(group: 0x66, number: 1, size: 4) == 0x40046601)
        #expect(NetBSDLike.ioWR(group: 0x66, number: 1, size: 16) == 0xc0106601)
    }

    @Test("Card Mach port matches the kernel through Swift export")
    func testParityMachTask() {
        let port = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.apple.machTaskSelf()
        #expect(port != 0)
        #expect(port == Darwin.mach_task_self_)
    }

    @Test("Standard duration preserves unsigned seconds and checked arithmetic")
    func testStandardDuration() throws {
        let duration = ExportedKotlinPackages.io.github.kotlinmania.libc.time.StdDuration.Companion.shared.fromSecs(seconds: UInt64.max)
        #expect(duration.asSecs() == UInt64.max)
        let one = ExportedKotlinPackages.io.github.kotlinmania.libc.time.StdDuration.Companion.shared.fromNanos(nanoseconds: 1)
        let sum = try #require(duration.checkedAdd(other: one))
        #expect(sum.subsecNanos() == 1)
        #expect(sum.asSecs() == UInt64.max)
        #expect(sum.checkedMul(factor: 2) == nil)
    }

}
