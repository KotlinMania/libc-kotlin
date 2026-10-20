// swift-tools-version: 6.0
import PackageDescription
import Foundation

let environment = ProcessInfo.processInfo.environment
let exportBuildRoot = environment["LIBC_SWIFT_EXPORT_BUILD_ROOT"] ?? "../build"
let exportProductsRoot = environment["LIBC_SWIFT_EXPORT_PRODUCTS_ROOT"] ?? "\(exportBuildRoot)/swift-test"

let package = Package(
    name: "SwiftTestHarness",
    platforms: [
        .macOS(.v15),
    ],
    dependencies: [
        .package(name: "Libc", path: "\(exportBuildRoot)/SPMPackage/macosArm64/Debug")
    ],
    targets: [
        .testTarget(
            name: "SwiftTestHarnessTests",
            dependencies: [
                .product(name: "LibcLibrary", package: "Libc")
            ],
            linkerSettings: [
                .unsafeFlags([
                    "-L", exportProductsRoot,
                    "-L", "\(exportBuildRoot)/MergedLibraries/macos/Debug",
                    "-lLibc",
                ]),
            ]
        ),
    ],
    swiftLanguageModes: [.v6]
)
