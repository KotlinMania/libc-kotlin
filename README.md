# libc-kotlin in Kotlin

> **Before working in this repo, read [`FFI_DESIGN.md`](FFI_DESIGN.md)** —
> the authoritative design for porting the 922 stub functions to real
> C/C++ FFI implementations via cinterop (native) and N-API (JS/WASM).

[![GitHub link](https://img.shields.io/badge/GitHub-KotlinMania%2Flibc--kotlin-blue.svg)](https://github.com/KotlinMania/libc-kotlin)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.kotlinmania/libc-kotlin)](https://central.sonatype.com/artifact/io.github.kotlinmania/libc-kotlin)
[![Build status](https://img.shields.io/github/actions/workflow/status/KotlinMania/libc-kotlin/ci.yml?branch=main)](https://github.com/KotlinMania/libc-kotlin/actions)

This is a Kotlin Multiplatform line-by-line transliteration port of [`rust-lang/libc`](https://github.com/rust-lang/libc).

**Original Project:** This port is based on [`rust-lang/libc`](https://github.com/rust-lang/libc). All design credit and project intent belong to the upstream authors; this repository is a faithful port to Kotlin Multiplatform with no behavioural changes intended.

### Porting status

This is an **in-progress port**. The goal is feature parity with the upstream Rust crate while providing a native Kotlin Multiplatform API. Every Kotlin file carries a `// port-lint: source <path>` header naming its upstream Rust counterpart so the AST-distance tool can track provenance.

---

## Upstream README — `rust-lang/libc`

> The text below is reproduced and lightly edited from [`https://github.com/rust-lang/libc`](https://github.com/rust-lang/libc). It is the upstream project's own description and remains under the upstream authors' authorship; links have been rewritten to absolute upstream URLs so they continue to resolve from this repository.

## libc - Raw FFI bindings to platforms' system libraries

[![GHA Status]][GitHub Actions] [![Latest Version]][crates.io] [![Documentation]][docs.rs] ![License]

`libc` provides all of the definitions necessary to easily interoperate with C
code (or "C-like" code) on each of the platforms that Rust supports. This
includes type definitions (e.g. `c_int`), constants (e.g. `EINVAL`) as well as
function headers (e.g. `malloc`).

This crate exports all underlying platform types, functions, and constants under
the crate root, so all items are accessible as `libc::foo`. The types and values
of all the exported APIs match the platform that libc is compiled for.

Windows API bindings are not included in this crate. If you are looking for
WinAPI bindings, consider using crates like [windows-sys].

More detailed information about the design of this library can be found in its
[associated RFC][rfc].

[rfc]: https://github.com/rust-lang/rfcs/blob/HEAD/text/1291-promote-libc.md
[windows-sys]: https://docs.rs/windows-sys

## v1.0 Roadmap

Currently, `libc` has two active branches: `main` for the upcoming v1.0 release,
and `libc-0.2` for the currently published version. By default all pull requests
should target `main`; once reviewed, they can be cherry picked to the `libc-0.2`
branch if needed.

We will stop making new v0.2 releases once v1.0 is released.

See the section in [CONTRIBUTING.md](https://github.com/rust-lang/libc/blob/HEAD/CONTRIBUTING.md#v10-roadmap) for more
details.

## Usage

Add the following to your `Cargo.toml`:

```toml
[dependencies]
libc = "0.2"
```

## Features

* `std`: by default `libc` links to the standard library. Disable this feature
  to remove this dependency and be able to use `libc` in `#![no_std]` crates.

* `extra_traits`: all `struct`s implemented in `libc` are `Copy` and `Clone`.
  This feature derives `Debug`, `Eq`, `Hash`, and `PartialEq`.

## Rust version support

The minimum supported Rust toolchain version is currently **Rust 1.65**.

Increases to the MSRV are allowed to change without a major (i.e. semver-
breaking) release in order to avoid a ripple effect in the ecosystem. A policy
for when this may change is a work in progress.

`libc` may continue to compile with Rust versions older than the current MSRV
but this is not guaranteed.

## Platform support

You can see the platform(target)-specific docs on [docs.rs], select a platform
you want to see.

See [`ci/verify-build.py`](https://github.com/rust-lang/libc/blob/HEAD/ci/verify-build.py) for
the platforms on which `libc` is guaranteed to build for each Rust toolchain.
The test matrices at [GitHub Actions] show the platforms in which `libc` tests
are run.

<div class="platform_docs"></div>

## License

This project is licensed under either of

* [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0)
  ([LICENSE-APACHE](https://github.com/rust-lang/libc/blob/HEAD/LICENSE-APACHE))

* [MIT License](https://opensource.org/licenses/MIT)
  ([LICENSE-MIT](https://github.com/rust-lang/libc/blob/HEAD/LICENSE-MIT))

at your option.

## Contributing

We welcome all people who want to contribute. Please see the
[contributing instructions] for more information.

[contributing instructions]: https://github.com/rust-lang/libc/blob/HEAD/CONTRIBUTING.md

Contributions in any form (issues, pull requests, etc.) to this project must
adhere to Rust's [Code of Conduct].

[Code of Conduct]: https://www.rust-lang.org/policies/code-of-conduct

Unless you explicitly state otherwise, any contribution intentionally submitted
for inclusion in `libc` by you, as defined in the Apache-2.0 license, shall be
dual licensed as above, without any additional terms or conditions.

[GitHub Actions]: https://github.com/rust-lang/libc/actions
[GHA Status]: https://github.com/rust-lang/libc/workflows/CI/badge.svg
[crates.io]: https://crates.io/crates/libc
[Latest Version]: https://img.shields.io/crates/v/libc.svg
[Documentation]: https://docs.rs/libc/badge.svg
[docs.rs]: https://docs.rs/libc
[License]: https://img.shields.io/crates/l/libc.svg

---

## About this Kotlin port

### Installation

```kotlin
dependencies {
    implementation("io.github.kotlinmania:libc-kotlin:0.1.0")
}
```

### Building

```bash
./gradlew build
./gradlew test
```

### Targets

- macOS arm64
- Linux x64
- Windows mingw-x64
- iOS arm64 / simulator-arm64 (Swift export + XCFramework)
- JS (browser + Node.js)
- Wasm-JS (browser + Node.js)
- Android (API 24+)

### Porting guidelines

See [AGENTS.md](AGENTS.md) and [CLAUDE.md](CLAUDE.md) for translator discipline, port-lint header convention, and Rust → Kotlin idiom mapping.

### License

This Kotlin port is distributed under the same MIT license as the upstream [`rust-lang/libc`](https://github.com/rust-lang/libc). See [LICENSE](LICENSE) (and any sibling `LICENSE-*` / `NOTICE` files mirrored from upstream) for the full text.

Original work copyrighted by the libc authors.  
Kotlin port: Copyright (c) 2026 Sydney Renee and The Solace Project.

### Acknowledgments

Thanks to the [`rust-lang/libc`](https://github.com/rust-lang/libc) maintainers and contributors for the original Rust implementation. This port reproduces their work in Kotlin Multiplatform; bug reports about upstream design or behavior should go to the upstream repository.
