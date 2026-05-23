import XCTest
import Libc

final class LibcExportTests: XCTestCase {
    func testPrimitiveTypealiases() throws {
        // Verify that the Kotlin typealiases map directly to standard Swift types
        let myChar: CChar = 127
        XCTAssertTrue(type(of: myChar) == Swift.Int8.self)
        
        let myInt: CInt = 42
        XCTAssertTrue(type(of: myInt) == Swift.Int32.self)
        
        let myWchar: solid.WCharT = 65535
        XCTAssertTrue(type(of: myWchar) == Swift.UInt32.self)
    }
}
