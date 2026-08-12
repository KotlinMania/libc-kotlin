// libc_bindings.cpp — Main N-API module init for libc native addon
// Shared between Kotlin/JS and Kotlin/WASM targets.
//
// This file is the entry point that registers all sub-module bindings.
// Each category (stdio, unistd, string, stdlib, math) has its own .cpp file
// and registers its functions via a Register() function.

#include <napi.h>

// Forward declarations of sub-module registration functions
void RegisterStdioBindings(Napi::Env env, Napi::Object exports);
void RegisterUnistdBindings(Napi::Env env, Napi::Object exports);
void RegisterStringBindings(Napi::Env env, Napi::Object exports);
void RegisterStdlibBindings(Napi::Env env, Napi::Object exports);
void RegisterMathBindings(Napi::Env env, Napi::Object exports);

Napi::Object Init(Napi::Env env, Napi::Object exports) {
    RegisterStdioBindings(env, exports);
    RegisterUnistdBindings(env, exports);
    RegisterStringBindings(env, exports);
    RegisterStdlibBindings(env, exports);
    RegisterMathBindings(env, exports);

    // Export errno as a getter (it changes after each call)
    exports.DefineProperty(Napi::PropertyDescriptor::Accessor(
        "errno",
        [](const Napi::CallbackInfo& info) -> Napi::Value {
            return Napi::Number::New(info.Env(), errno);
        },
        napi_enumerable));

    return exports;
}

NODE_API_MODULE(libc_native, Init)