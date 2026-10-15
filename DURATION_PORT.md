# Standard duration

Sydney explicitly assigned the standard duration port to libc-kotlin. Upstream filedescriptor 0.8.3 imports Rust std::time::Duration; its Cargo.toml does not depend on chrono or time.

The implementation follows Rust 1.85.0 library/core/src/time.rs (MIT OR Apache-2.0): https://github.com/rust-lang/rust/blob/1.85.0/library/core/src/time.rs . The full upstream file was read before translation. Source retrieval evidence is retained locally under tmp/strong-typing-validation/rust-core-time-1.85.0.rs.

StdDuration is a concrete class preserving u64 seconds and normalized nanoseconds. Constructors, comparison, checked/saturating arithmetic, scalar multiplication/division and seconds/subsecond accessors are implemented. This is the polling-required subset, not a claim of full standard-library parity. u128 total-unit accessors and floating-point constructors are not implemented.

No Kotlin time wrapper, typealias, platform interop, or new generic abstraction is introduced. The next source version is 0.1.10; publication remains blocked on the strict Swift gate. Removing its old warning override exposed Kotlin 2.4.20 generated bridge warnings. No suppression has been restored.
