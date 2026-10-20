# Swift 6 error boundary and upstream semantics

Rust libc is a raw system FFI binding. Its upstream `tmp/libc/src/lib.rs` is no_std, and `tmp/libc/src/unix/mod.rs` exposes integer descriptor results. Apple `__error` returns a pointer to errno. These APIs do not define an owned Throwable or promise a mutable object identity across a Swift error boundary.

The neighboring Rust Syn error implementation owns diagnostic message strings and guards span access with its originating thread. `syn-kotlin/tmp/syn/src/error.rs` explicitly falls back to a call-site span on another thread; `thread.rs` supplies that guard. This supports transport of diagnostics without unrestricted transport of foreign mutable objects. It does not justify blindly declaring KotlinBase Sendable.

The observed generated runtime error is separate from libc Error.kt filenames: Swift6 Error requires Sendable, while the generated KotlinError stores public mutable wrapped:KotlinBase. The generated dependency must compile in Swift6 itself; a Swift6 test target importing a dependency compiled in Swift5 is insufficient.

`swift-test-harness/StrictSwift.xcconfig` makes the dependency language mode6 and warnings-as-errors explicit for local embedding and the reusable Swift workflow. The harness Package declares mode6; local and CI Swift test commands require warnings-as-errors. Generated Package.swift and serialization source are no longer rewritten. Runtime corrections belong in the shared producer source.

The diagnostic SAM tests invoke the callback directly. Upstream NetBSD `esetfunc` accepts a nullable callback and returns a nullable previous callback; the existing common Kotlin passthrough is not evidence of physical NetBSD registration. The Swift test covers its generated factory/protocol round trip, and the common test covers signed status and nullable message forwarding. Neither asserts passthrough identity or null rejection as an upstream registration contract.

## Measured isolated result at299ad76b

The repaired experimental exporter compiled and linked the real generated Native bridge with strict Kotlin warnings and all93813 forward Libc C exports present. All five C headers matched retained generated evidence. Generated Swift dependency compilation in actual mode6 failed on KotlinError.wrapped sendability, before any of the eight real Swift tests executed. The41 reverse Swift callback definitions were not verified. This is no full-library, full-platform or release pass.

The source correction here strengthens the maintained gates and corrects the test expectations. Its execution is recorded per exact source revision in workspace automation-artifacts/2026-10-20-libc-isolated-exporter-validation. No test outcome from299ad76b is attributed to a newer source revision. No suppression, unsafe Sendable, installed compiler replacement or generated-output edit is part of this change.
