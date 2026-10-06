import Darwin
import Testing
import Libc

@Suite("Libc Export Smoke Tests")
struct LibcExportTests {
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

}
