{
  "targets": [
    {
      "target_name": "libc_native",
      "sources": [
        "src/libc_bindings.cpp",
        "src/stdio_bindings.cpp",
        "src/unistd_bindings.cpp",
        "src/string_bindings.cpp",
        "src/stdlib_bindings.cpp",
        "src/math_bindings.cpp"
      ],
      "include_dirs": [
        "<!@(node -p \"require('node-addon-api').include\")"
      ],
      "dependencies": [
        "<!(node -p \"require('node-addon-api').gyp\")"
      ],
      "cflags!": [ "-fno-exceptions" ],
      "cflags_cc!": [ "-fno-exceptions" ],
      "defines": [ "NAPI_DISABLE_CPP_EXCEPTIONS" ],
      "xcode_settings": {
        "GCC_ENABLE_CPP_EXCEPTIONS": "YES",
        "CLANG_CXX_LIBRARY": "libc++",
        "MACOSX_DEPLOYMENT_TARGET": "10.15"
      }
    }
  ]
}
