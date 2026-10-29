// unistd_bindings.cpp — N-API wrappers for C unistd.h functions
#include <napi.h>
#include <cerrno>
#include <cstdint>
#include <climits>
#include <cmath>
#include <string>
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#ifndef NOMINMAX
#define NOMINMAX
#endif
#include <windows.h>
#include <tlhelp32.h>
#include <io.h>
#include <process.h>
#else
#include <unistd.h>
#endif

namespace {
bool transferArguments(const Napi::CallbackInfo& info) {
    const auto env = info.Env();
    if (info.Length() < 3 || !info[0].IsNumber() || !info[1].IsTypedArray() ||
        info[1].As<Napi::TypedArray>().TypedArrayType() != napi_uint8_array || !info[2].IsNumber()) {
        Napi::TypeError::New(env, "read/write require an integer descriptor, Uint8Array and integer count").ThrowAsJavaScriptException();
        return false;
    }
    const double descriptor = info[0].As<Napi::Number>().DoubleValue();
    const double count = info[2].As<Napi::Number>().DoubleValue();
    if (!std::isfinite(descriptor) || std::trunc(descriptor) != descriptor || descriptor < INT_MIN || descriptor > INT_MAX ||
        !std::isfinite(count) || std::trunc(count) != count || count < -9007199254740991.0 || count > 9007199254740991.0) {
        Napi::TypeError::New(env, "read/write descriptor must be int32 and count must be a safe integer").ThrowAsJavaScriptException();
        return false;
    }
    return true;
}
}

void RegisterUnistdBindings(Napi::Env env, Napi::Object exports) {
    // close
    exports.Set("close", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "close requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
#ifdef _WIN32
        return Napi::Number::New(env, ::_close(fd));
#else
        return Napi::Number::New(env, ::close(fd));
#endif
    }));

    // read — returns number of bytes read into buffer
    exports.Set("read", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (!transferArguments(info)) return env.Null();
        int fd = info[0].As<Napi::Number>().Int32Value();
        auto buffer = info[1].As<Napi::Uint8Array>();
        int64_t count = info[2].As<Napi::Number>().Int64Value();
        if (count < 0 || static_cast<uint64_t>(count) > buffer.ByteLength()) {
            errno = EINVAL;
            return Napi::Number::New(env, -1);
        }
#ifdef _WIN32
        if (count > INT_MAX) { errno = EINVAL; return Napi::Number::New(env, -1); }
        int result = ::_read(fd, buffer.Data(), static_cast<unsigned int>(count));
#else
        ssize_t result = ::read(fd, buffer.Data(), static_cast<size_t>(count));
#endif
        return Napi::Number::New(env, static_cast<double>(result));
    }));

    // write — returns number of bytes written
    exports.Set("write", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (!transferArguments(info)) return env.Null();
        int fd = info[0].As<Napi::Number>().Int32Value();
        auto buffer = info[1].As<Napi::Uint8Array>();
        int64_t count = info[2].As<Napi::Number>().Int64Value();
        if (count < 0 || static_cast<uint64_t>(count) > buffer.ByteLength()) {
            errno = EINVAL;
            return Napi::Number::New(env, -1);
        }
#ifdef _WIN32
        if (count > INT_MAX) { errno = EINVAL; return Napi::Number::New(env, -1); }
        int result = ::_write(fd, buffer.Data(), static_cast<unsigned int>(count));
#else
        ssize_t result = ::write(fd, buffer.Data(), static_cast<size_t>(count));
#endif
        return Napi::Number::New(env, static_cast<double>(result));
    }));

    // lseek
    exports.Set("lseek", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "lseek requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        int64_t offset = info[1].As<Napi::Number>().Int64Value();
        int whence = info[2].As<Napi::Number>().Int32Value();
#ifdef _WIN32
        return Napi::Number::New(env, static_cast<double>(::_lseeki64(fd, offset, whence)));
#else
        return Napi::Number::New(env, static_cast<double>(::lseek(fd, static_cast<off_t>(offset), whence)));
#endif
    }));

    // _exit
    exports.Set("_exit", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "_exit requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int status = info[0].As<Napi::Number>().Int32Value();
        ::_exit(status);
        return env.Undefined();
    }));

    // access
    exports.Set("access", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "access requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int mode = info[1].As<Napi::Number>().Int32Value();
#ifdef _WIN32
        if ((mode & ~6) != 0) { errno = EINVAL; return Napi::Number::New(env, -1); }
        auto text = info[0].As<Napi::String>().Utf16Value();
        std::wstring path(text.begin(), text.end());
        return Napi::Number::New(env, ::_waccess(path.c_str(), mode));
#else
        std::string path = info[0].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, ::access(path.c_str(), mode));
#endif
    }));

    // unlink
    exports.Set("unlink", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "unlink requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
#ifdef _WIN32
        auto text = info[0].As<Napi::String>().Utf16Value();
        std::wstring path(text.begin(), text.end());
        return Napi::Number::New(env, ::_wunlink(path.c_str()));
#else
        std::string path = info[0].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, ::unlink(path.c_str()));
#endif
    }));

    // gethostname
    exports.Set("gethostname", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifdef _WIN32
        wchar_t name[256];
        DWORD size = sizeof(name) / sizeof(name[0]);
        if (!GetComputerNameExW(ComputerNameDnsHostname, name, &size)) {
            Napi::Error::New(env, "GetComputerNameExW failed: " + std::to_string(GetLastError())).ThrowAsJavaScriptException();
            return env.Null();
        }
        return Napi::String::New(env, std::u16string(name, name + size));
#else
        char name[256];
        if (::gethostname(name, sizeof(name)) != 0) {
            return Napi::String::New(env, "");
        }
        return Napi::String::New(env, name);
#endif
    }));

    // getpid
    exports.Set("getpid", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
#ifdef _WIN32
        return Napi::Number::New(info.Env(), ::_getpid());
#else
        return Napi::Number::New(info.Env(), ::getpid());
#endif
    }));

    // getppid
    exports.Set("getppid", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
#ifdef _WIN32
        Napi::Env env = info.Env();
        HANDLE snapshot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
        if (snapshot == INVALID_HANDLE_VALUE) {
            Napi::Error::New(env, "CreateToolhelp32Snapshot failed: " + std::to_string(GetLastError())).ThrowAsJavaScriptException();
            return env.Null();
        }
        PROCESSENTRY32W entry{};
        entry.dwSize = sizeof(entry);
        DWORD current = GetCurrentProcessId();
        BOOL found = Process32FirstW(snapshot, &entry);
        while (found && entry.th32ProcessID != current) found = Process32NextW(snapshot, &entry);
        DWORD error = found ? ERROR_SUCCESS : GetLastError();
        DWORD parent = entry.th32ParentProcessID;
        CloseHandle(snapshot);
        if (!found) {
            Napi::Error::New(env, "Parent process lookup failed: " + std::to_string(error)).ThrowAsJavaScriptException();
            return env.Null();
        }
        return Napi::Number::New(env, parent);
#else
        return Napi::Number::New(info.Env(), ::getppid());
#endif
    }));

    // sleep
    exports.Set("sleep", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "sleep requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        unsigned int seconds = info[0].As<Napi::Number>().Uint32Value();
#ifdef _WIN32
        while (seconds > 4294967u) { Sleep(4294967000u); seconds -= 4294967u; }
        Sleep(seconds * 1000u);
        return Napi::Number::New(env, 0);
#else
        return Napi::Number::New(env, ::sleep(seconds));
#endif
    }));

    // isatty
    exports.Set("isatty", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "isatty requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
#ifdef _WIN32
        if (fd < 0) { errno = EBADF; return Napi::Number::New(env, 0); }
        return Napi::Number::New(env, ::_isatty(fd));
#else
        return Napi::Number::New(env, ::isatty(fd));
#endif
    }));
}
