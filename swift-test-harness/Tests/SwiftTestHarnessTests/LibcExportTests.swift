import Testing
import Libc

@Suite("Libc Export Smoke Tests")
struct LibcExportTests {
    @Test("Swift module loads cleanly")
    func testSwiftModuleLoads() throws {
        #expect(true)
    }
}

