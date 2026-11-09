import Darwin
import Foundation
import Testing
import Libc

@Suite("Libc Export Smoke Tests")
struct LibcExportTests {
    @Test("Real allocation, descriptor IO and typed fcntl preserve bytes")
    func testRealDescriptorIo() throws {
        typealias Unix = ExportedKotlinPackages.io.github.kotlinmania.libc.unix
        typealias Apple = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.apple
        let source = try #require(Unix.malloc(size: 64))
        let destination = try #require(Unix.calloc(nobj: 64, size: 1))
        defer {
            Unix.free(p: source)
            Unix.free(p: destination)
        }
        #expect(Unix.memset(dest: source, c: 171, n: 64)?.value == source.value)
        #expect(Unix.memcmp(cx: source, ct: destination, n: 64) != 0)
        let outputDirectory = ProcessInfo.processInfo.environment["LIBC_SWIFT_TEST_OUTPUT_ROOT"] ?? "../../../build"
        let path = "\(outputDirectory)/swift-io-\(UUID().uuidString).bin"
        let fd = Unix.open(path: path, oflag: Apple.O_RDWR | Apple.O_CREAT | Apple.O_TRUNC, variadicArgs: [0o600])
        #expect(fd >= 0)
        guard fd >= 0 else { return }
        defer {
            #expect(Unix.close(fd: fd) == 0)
            #expect(Unix.unlink(c: path) == 0)
        }
        #expect(Unix.write(fd: fd, buf: source, count: 64) == 64)
        #expect(Unix.lseek(fd: fd, offset: 0, whence: Apple.SEEK_SET) == 0)
        #expect(Unix.read(fd: fd, buf: destination, count: 64) == 64)
        #expect(Unix.memcmp(cx: source, ct: destination, n: 64) == 0)
        #expect(Unix.read(fd: fd, buf: destination, count: 1) == 0)
        let original = Unix.fcntl(fd: fd, cmd: Apple.F_GETFD, variadicArgs: [])
        #expect(original >= 0)
        #expect(Unix.fcntl(fd: fd, cmd: Apple.F_SETFD, variadicArgs: [Int64(original | Apple.FD_CLOEXEC)]) == 0)
        #expect(Unix.fcntl(fd: fd, cmd: Apple.F_GETFD, variadicArgs: []) & Apple.FD_CLOEXEC != 0)
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
        #expect(Apple.SYSDIR_DIRECTORY_ALL_APPLICATIONS == 100)
        #expect(Apple.SYSDIR_DOMAIN_MASK_ALL == 0xffff)
        #expect(FreeBSD.DEVSTAT_TYPE_IF_SCSI == 0x10)
        #expect(FreeBSD.DEVSTAT_PRIORITY_MAX == 0xfff)
    }

    @Test("Card ioctl encoding survives Swift export")
    func testParityIoctl() {
        typealias NetBSDLike = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.netbsdlike
        #expect(NetBSDLike.ior(g: 0x66, n: 1, len: 4) == 0x40046601)
        #expect(NetBSDLike.iowr(g: 0x66, n: 1, len: 16) == 0xc0106601)
    }

    @Test("Card Mach port matches the kernel through Swift export")
    func testParityMachTask() {
        let port = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.apple.machTaskSelf()
        #expect(port != 0)
        #expect(port == Darwin.mach_task_self_)
    }
}
