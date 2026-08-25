import XCTest
import Libc

final class LibcExportTests: XCTestCase {
    func testSwiftModuleLoads() throws {
        XCTAssertTrue(true, "Libc swift module imported cleanly")
    }
}

