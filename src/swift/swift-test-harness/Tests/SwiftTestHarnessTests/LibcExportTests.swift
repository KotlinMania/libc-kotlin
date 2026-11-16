import Darwin
import Foundation
import Testing
import RustLang
import Libc

@Suite("Libc Export Smoke Tests")
struct LibcExportTests {
    @Test("Real allocation, descriptor IO and typed fcntl preserve bytes")
    func testRealDescriptorIo() throws {
        typealias Unix = ExportedKotlinPackages.io.github.kotlinmania.libc.unix
        typealias Bsd = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd
        typealias Apple = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.apple
        typealias AllocFfi = ExportedKotlinPackages.io.github.kotlinmania.rustlang.alloc.ffi
        let source = Unix.malloc(size: 64)
        let destination = Unix.calloc(nobj: 64, size: 1)
        #expect(!source.isNull())
        #expect(!destination.isNull())
        defer {
            Unix.free(p: source)
            Unix.free(p: destination)
        }
        #expect(Unix.memset(dest: source, c: 171, n: 64).rawAddress == source.rawAddress)
        #expect(Unix.memcmp(cx: source.castConst(), ct: destination.castConst(), n: 64) != 0)
        let outputDirectory = ProcessInfo.processInfo.environment["LIBC_SWIFT_TEST_OUTPUT_ROOT"] ?? "../../../build"
        let path = "\(outputDirectory)/swift-io-\(UUID().uuidString).bin"
        let pathCStr = AllocFfi.CString.Companion.shared.fromStringUnchecked(text: path)
        defer {
            pathCStr.deallocate()
        }
        let fd = Unix.open(path: pathCStr.asPtr(), oflag: Bsd.O_RDWR | Bsd.O_CREAT | Bsd.O_TRUNC, variadicArgs: 0o600)
        #expect(fd >= 0)
        guard fd >= 0 else { return }
        defer {
            #expect(Unix.close(fd: fd) == 0)
            #expect(Unix.unlink(c: pathCStr.asPtr()) == 0)
        }
        #expect(Unix.write(fd: fd, buf: source.castConst(), count: 64) == 64)
        #expect(Unix.lseek(fd: fd, offset: 0, whence: Apple.SEEK_SET) == 0)
        #expect(Unix.read(fd: fd, buf: destination, count: 64) == 64)
        #expect(Unix.memcmp(cx: source.castConst(), ct: destination.castConst(), n: 64) == 0)
        #expect(Unix.read(fd: fd, buf: destination, count: 1) == 0)
        let original = Unix.fcntl(fd: fd, cmd: Apple.F_GETFD)
        #expect(original >= 0)
        #expect(Unix.fcntl(fd: fd, cmd: Apple.F_SETFD, variadicArgs: Int64(original | Unix.FD_CLOEXEC)) == 0)
        #expect(Unix.fcntl(fd: fd, cmd: Apple.F_GETFD) & Unix.FD_CLOEXEC != 0)
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
        typealias NetBSD = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
        let outIoc = NetBSD.ioc(`inout`: NetBSDLike.IOC_OUT, group: 0x66, num: 1, len: 4)
        let inOutIoc = NetBSD.ioc(`inout`: NetBSDLike.IOC_INOUT, group: 0x66, num: 1, len: 16)
        #expect(outIoc == 0x40046601)
        #expect(inOutIoc == 0xc0106601)
    }

    @Test("Card Mach port matches the kernel through Swift export")
    func testParityMachTask() {
        let port = ExportedKotlinPackages.io.github.kotlinmania.libc.unix.bsd.apple.machTaskSelf()
        #expect(port != 0)
        #expect(port == Darwin.mach_task_self_)
    }
}
