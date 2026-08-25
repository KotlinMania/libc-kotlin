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
}
