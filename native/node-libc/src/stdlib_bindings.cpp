// stdlib_bindings.cpp — N-API wrappers for C stdlib.h functions
#include <napi.h>
#include <cstdlib>
#include <cstring>
#include <cerrno>
#ifndef _WIN32
extern "C" char **environ;
#endif

void RegisterStdlibBindings(Napi::Env env, Napi::Object exports) {
    // malloc — returns a pointer as number
    exports.Set("malloc", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "malloc requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        size_t size = info[0].As<Napi::Number>().Int64Value();
        void* ptr = ::malloc(size);
        if (!ptr) return Napi::Number::New(env, 0);
        return Napi::Number::New(env, reinterpret_cast<intptr_t>(ptr));
    }));

    // calloc
    exports.Set("calloc", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "calloc requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        size_t nobj = info[0].As<Napi::Number>().Int64Value();
        size_t size = info[1].As<Napi::Number>().Int64Value();
        void* ptr = ::calloc(nobj, size);
        if (!ptr) return Napi::Number::New(env, 0);
        return Napi::Number::New(env, reinterpret_cast<intptr_t>(ptr));
    }));

    // realloc
    exports.Set("realloc", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "realloc requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        void* ptr = reinterpret_cast<void*>(info[0].As<Napi::Number>().Int64Value());
        size_t size = info[1].As<Napi::Number>().Int64Value();
        void* result = ::realloc(ptr, size);
        if (!result) return Napi::Number::New(env, 0);
        return Napi::Number::New(env, reinterpret_cast<intptr_t>(result));
    }));

    // free
    exports.Set("free", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "free requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        void* ptr = reinterpret_cast<void*>(info[0].As<Napi::Number>().Int64Value());
        ::free(ptr);
        return env.Undefined();
    }));

    // atoi
    exports.Set("atoi", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "atoi requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string str = info[0].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, ::atoi(str.c_str()));
    }));

    // strtol
    exports.Set("strtol", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "strtol requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string str = info[0].As<Napi::String>().Utf8Value();
        int base = info[2].As<Napi::Number>().Int32Value();
        return Napi::Number::New(env, static_cast<double>(::strtol(str.c_str(), nullptr, base)));
    }));

    // strtod
    exports.Set("strtod", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "strtod requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string str = info[0].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, ::strtod(str.c_str(), nullptr));
    }));

    // exit
    exports.Set("exit", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "exit requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int status = info[0].As<Napi::Number>().Int32Value();
        ::exit(status);
        return env.Undefined();
    }));

    // getenv
    exports.Set("getenv", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "getenv requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string name = info[0].As<Napi::String>().Utf8Value();
        const char* result = ::getenv(name.c_str());
        if (!result) return env.Null();
        return Napi::String::New(env, result);
    }));

    // setenv
    exports.Set("setenv", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "setenv requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string name = info[0].As<Napi::String>().Utf8Value();
        std::string val = info[1].As<Napi::String>().Utf8Value();
        int overwrite = info[2].As<Napi::Number>().Int32Value();
#ifdef _WIN32
        if (!overwrite && ::getenv(name.c_str()) != nullptr) return Napi::Number::New(env, 0);
        return Napi::Number::New(env, ::_putenv_s(name.c_str(), val.c_str()) == 0 ? 0 : -1);
#else
        return Napi::Number::New(env, ::setenv(name.c_str(), val.c_str(), overwrite));
#endif
    }));

    // unsetenv
    exports.Set("unsetenv", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "unsetenv requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string name = info[0].As<Napi::String>().Utf8Value();
#ifdef _WIN32
        return Napi::Number::New(env, ::_putenv_s(name.c_str(), "") == 0 ? 0 : -1);
#else
        return Napi::Number::New(env, ::unsetenv(name.c_str()));
#endif
    }));

    // putenv
    exports.Set("putenv", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "putenv requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string str = info[0].As<Napi::String>().Utf8Value();
        char* dup = ::strdup(str.c_str());
        if (!dup) return Napi::Number::New(env, -1);
#ifdef _WIN32
        return Napi::Number::New(env, ::_putenv(dup));
#else
        return Napi::Number::New(env, ::putenv(dup));
#endif
    }));

    // putenv_s
    exports.Set("putenv_s", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "putenv_s requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string name = info[0].As<Napi::String>().Utf8Value();
        std::string val = info[1].As<Napi::String>().Utf8Value();
#ifdef _WIN32
        return Napi::Number::New(env, ::_putenv_s(name.c_str(), val.c_str()));
#else
        if (name.find('=') != std::string::npos) return Napi::Number::New(env, EINVAL);
        if (val.empty()) {
            return Napi::Number::New(env, ::unsetenv(name.c_str()) == 0 ? 0 : errno);
        }
        return Napi::Number::New(env, ::setenv(name.c_str(), val.c_str(), 1) == 0 ? 0 : errno);
#endif
    }));

    // clearenv
    exports.Set("clearenv", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#if defined(__linux__) || defined(__ANDROID__)
        return Napi::Number::New(env, ::clearenv());
#elif !defined(_WIN32)
        if (environ != nullptr) {
            while (environ[0] != nullptr) {
                const char* entry = environ[0];
                const char* eq = std::strchr(entry, '=');
                size_t len = eq ? static_cast<size_t>(eq - entry) : std::strlen(entry);
                std::string name(entry, len);
                if (::unsetenv(name.c_str()) != 0) return Napi::Number::New(env, -1);
            }
        }
        return Napi::Number::New(env, 0);
#else
        return Napi::Number::New(env, -1);
#endif
    }));

    // system
    exports.Set("system", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            return Napi::Number::New(env, ::system(nullptr));
        }
        std::string cmd = info[0].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, ::system(cmd.c_str()));
    }));
}