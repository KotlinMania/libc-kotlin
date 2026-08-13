// string_bindings.cpp — N-API wrappers for C string.h functions
#include <napi.h>
#include <cstring>

void RegisterStringBindings(Napi::Env env, Napi::Object exports) {
    // strlen
    exports.Set("strlen", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "strlen requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string str = info[0].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, static_cast<double>(str.length()));
    }));

    // strcmp
    exports.Set("strcmp", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "strcmp requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string a = info[0].As<Napi::String>().Utf8Value();
        std::string b = info[1].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, ::strcmp(a.c_str(), b.c_str()));
    }));

    // strncmp
    exports.Set("strncmp", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "strncmp requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string a = info[0].As<Napi::String>().Utf8Value();
        std::string b = info[1].As<Napi::String>().Utf8Value();
        size_t n = info[2].As<Napi::Number>().Int64Value();
        return Napi::Number::New(env, ::strncmp(a.c_str(), b.c_str(), n));
    }));

    // memcpy — takes dst buffer, src buffer, count
    exports.Set("memcpy", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "memcpy requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        auto dst = info[0].As<Napi::Uint8Array>();
        auto src = info[1].As<Napi::Uint8Array>();
        size_t n = info[2].As<Napi::Number>().Int64Value();
        ::memcpy(dst.Data(), src.Data(), n);
        return dst;
    }));

    // memset — takes buffer, value (int), count
    exports.Set("memset", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "memset requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        auto buf = info[0].As<Napi::Uint8Array>();
        int value = info[1].As<Napi::Number>().Int32Value();
        size_t n = info[2].As<Napi::Number>().Int64Value();
        ::memset(buf.Data(), value, n);
        return buf;
    }));

    // memcmp
    exports.Set("memcmp", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "memcmp requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        auto a = info[0].As<Napi::Uint8Array>();
        auto b = info[1].As<Napi::Uint8Array>();
        size_t n = info[2].As<Napi::Number>().Int64Value();
        return Napi::Number::New(env, ::memcmp(a.Data(), b.Data(), n));
    }));

    // strchr — returns index of first occurrence, or -1
    exports.Set("strchr", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "strchr requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string str = info[0].As<Napi::String>().Utf8Value();
        int ch = info[1].As<Napi::Number>().Int32Value();
        const char* result = ::strchr(str.c_str(), ch);
        if (!result) return Napi::Number::New(env, -1);
        return Napi::Number::New(env, result - str.c_str());
    }));
}