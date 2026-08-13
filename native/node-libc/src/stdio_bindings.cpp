// stdio_bindings.cpp — N-API wrappers for C stdio.h functions
#include <napi.h>
#include <cstdio>
#include <cstring>

void RegisterStdioBindings(Napi::Env env, Napi::Object exports) {
    // fopen — returns a pointer as number (or -1 on failure)
    exports.Set("fopen", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "fopen requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string path = info[0].As<Napi::String>().Utf8Value();
        std::string mode = info[1].As<Napi::String>().Utf8Value();
        FILE* fp = ::fopen(path.c_str(), mode.c_str());
        if (!fp) return Napi::Number::New(env, -1);
        return Napi::Number::New(env, reinterpret_cast<intptr_t>(fp));
    }));

    // fclose
    exports.Set("fclose", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "fclose requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        FILE* fp = reinterpret_cast<FILE*>(info[0].As<Napi::Number>().Int64Value());
        return Napi::Number::New(env, ::fclose(fp));
    }));

    // fread — returns number of items read
    exports.Set("fread", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 4) {
            Napi::TypeError::New(env, "fread requires 4 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        // buffer is a Node Buffer or ArrayBuffer
        auto buffer = info[0].As<Napi::Uint8Array>();
        size_t size = info[1].As<Napi::Number>().Int64Value();
        size_t count = info[2].As<Napi::Number>().Int64Value();
        FILE* fp = reinterpret_cast<FILE*>(info[3].As<Napi::Number>().Int64Value());
        size_t result = ::fread(buffer.Data(), size, count, fp);
        return Napi::Number::New(env, result);
    }));

    // fwrite — returns number of items written
    exports.Set("fwrite", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 4) {
            Napi::TypeError::New(env, "fwrite requires 4 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        auto buffer = info[0].As<Napi::Uint8Array>();
        size_t size = info[1].As<Napi::Number>().Int64Value();
        size_t count = info[2].As<Napi::Number>().Int64Value();
        FILE* fp = reinterpret_cast<FILE*>(info[3].As<Napi::Number>().Int64Value());
        size_t result = ::fwrite(buffer.Data(), size, count, fp);
        return Napi::Number::New(env, result);
    }));

    // fseek
    exports.Set("fseek", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "fseek requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        FILE* fp = reinterpret_cast<FILE*>(info[0].As<Napi::Number>().Int64Value());
        long offset = info[1].As<Napi::Number>().Int64Value();
        int whence = info[2].As<Napi::Number>().Int32Value();
        return Napi::Number::New(env, ::fseek(fp, offset, whence));
    }));

    // ftell
    exports.Set("ftell", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "ftell requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        FILE* fp = reinterpret_cast<FILE*>(info[0].As<Napi::Number>().Int64Value());
        return Napi::Number::New(env, ::ftell(fp));
    }));

    // fflush
    exports.Set("fflush", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "fflush requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        FILE* fp = reinterpret_cast<FILE*>(info[0].As<Napi::Number>().Int64Value());
        return Napi::Number::New(env, ::fflush(fp));
    }));

    // printf (simplified — writes to stdout)
    exports.Set("printf", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return Napi::Number::New(env, 0);
        std::string str = info[0].As<Napi::String>().Utf8Value();
        int result = ::printf("%s", str.c_str());
        return Napi::Number::New(env, result);
    }));
}