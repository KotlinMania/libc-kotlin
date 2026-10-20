#include "../../../src/nativeInterop/cinterop/macro_parity_fixture.h"
#include <napi.h>
#include <cerrno>
#include <cstdint>
#include <cstdlib>
#include <cstring>
#include <cstdio>
#include <fcntl.h>
#include <limits.h>
#ifdef _WIN32
#include <io.h>
#include <sys/stat.h>
#include <winsock2.h>
#include <ws2tcpip.h>
#else
#include <unistd.h>
#include <netdb.h>
#endif

static thread_local int rawLastError;
static uint64_t rawUnsigned(const Napi::Value& value) {
    return std::strtoull(value.As<Napi::String>().Utf8Value().c_str(), nullptr, 10);
}
static void* rawPointer(const Napi::Value& value) {
    return reinterpret_cast<void*>(static_cast<uintptr_t>(rawUnsigned(value)));
}
static Napi::String rawAddress(Napi::Env env, void* address) {
    int saved = errno;
    auto result = Napi::String::New(env, std::to_string(reinterpret_cast<uintptr_t>(address)));
    rawLastError = saved;
    return result;
}
static Napi::String rawCount(Napi::Env env, int64_t count) {
    int saved = errno;
    auto result = Napi::String::New(env, std::to_string(count));
    rawLastError = saved;
    return result;
}
static Napi::Number rawInteger(Napi::Env env, int value) {
    int saved = errno;
    auto result = Napi::Number::New(env, value);
    rawLastError = saved;
    return result;
}

void RegisterRawBindings(Napi::Env env, Napi::Object exports) {
    exports.Set("macroLayoutValue", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return Napi::String::New(info.Env(), std::to_string(libc_macro_layout_value(info[0].As<Napi::Number>().Int32Value())));
    }));
    exports.Set("rawAbiVersion", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return Napi::Number::New(info.Env(), 2);
    }));
    exports.Set("rawNumericNameinfoFlags", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return Napi::Number::New(info.Env(), NI_NUMERICHOST | NI_NUMERICSERV);
    }));
    exports.Set("rawOpenFlag", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        const int values[] = { O_RDONLY, O_WRONLY, O_RDWR, O_CREAT, O_TRUNC, SEEK_SET,
#ifdef _WIN32
        _O_BINARY
#else
        0
#endif
    };
        const int index = info[0].As<Napi::Number>().Int32Value();
        if (index < 0 || index >= 7) { errno = EINVAL; return rawInteger(info.Env(), -1); }
        return Napi::Number::New(info.Env(), values[index]);
    }));
    exports.Set("rawDescriptorCommand", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
#ifdef _WIN32
        return Napi::Number::New(info.Env(), -1);
#else
        const int values[] = { F_GETFD, F_SETFD, FD_CLOEXEC, EBADF };
        const int index = info[0].As<Napi::Number>().Int32Value();
        if (index < 0 || index >= 4) { errno = EINVAL; return rawInteger(info.Env(), -1); }
        return Napi::Number::New(info.Env(), values[index]);
#endif
    }));
    exports.Set("rawAllocate", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return rawAddress(info.Env(), std::malloc(static_cast<size_t>(rawUnsigned(info[0]))));
    }));
    exports.Set("rawAllocateZeroed", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return rawAddress(info.Env(), std::calloc(static_cast<size_t>(rawUnsigned(info[0])), static_cast<size_t>(rawUnsigned(info[1]))));
    }));
    exports.Set("rawResize", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return rawAddress(info.Env(), std::realloc(rawPointer(info[0]), static_cast<size_t>(rawUnsigned(info[1]))));
    }));
    exports.Set("rawRelease", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        std::free(rawPointer(info[0])); rawLastError = errno; return info.Env().Undefined();
    }));
    exports.Set("rawFill", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return rawAddress(info.Env(), std::memset(rawPointer(info[0]), info[1].As<Napi::Number>().Int32Value(), static_cast<size_t>(rawUnsigned(info[2]))));
    }));
    exports.Set("rawCopy", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return rawAddress(info.Env(), std::memcpy(rawPointer(info[0]), rawPointer(info[1]), static_cast<size_t>(rawUnsigned(info[2]))));
    }));
    exports.Set("rawCompare", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return rawInteger(info.Env(), std::memcmp(rawPointer(info[0]), rawPointer(info[1]), static_cast<size_t>(rawUnsigned(info[2]))));
    }));
    exports.Set("rawOpen", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        if (info[0].IsNull() || info[0].IsUndefined()) { errno = EFAULT; return rawInteger(info.Env(), -1); }
        std::string path = info[0].As<Napi::String>().Utf8Value();
        int flags = info[1].As<Napi::Number>().Int32Value();
        int mode = info[2].As<Napi::Number>().Int32Value();
#ifdef _WIN32
        return rawInteger(info.Env(), _open(path.c_str(), flags, mode));
#else
        return rawInteger(info.Env(), ::open(path.c_str(), flags, static_cast<mode_t>(mode)));
#endif
    }));
    exports.Set("rawClose", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        int fd = info[0].As<Napi::Number>().Int32Value();
#ifdef _WIN32
        return rawInteger(info.Env(), _close(fd));
#else
        return rawInteger(info.Env(), ::close(fd));
#endif
    }));
    exports.Set("rawRead", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        int fd = info[0].As<Napi::Number>().Int32Value();
        void* address = rawPointer(info[1]);
        uint64_t size = rawUnsigned(info[2]);
#ifdef _WIN32
        if (size > UINT_MAX) { errno = EINVAL; return rawCount(info.Env(), -1); }
        return rawCount(info.Env(), _read(fd, address, static_cast<unsigned int>(size)));
#else
        return rawCount(info.Env(), ::read(fd, address, static_cast<size_t>(size)));
#endif
    }));
    exports.Set("rawWrite", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        int fd = info[0].As<Napi::Number>().Int32Value();
        void* address = rawPointer(info[1]);
        uint64_t size = rawUnsigned(info[2]);
#ifdef _WIN32
        if (size > UINT_MAX) { errno = EINVAL; return rawCount(info.Env(), -1); }
        return rawCount(info.Env(), _write(fd, address, static_cast<unsigned int>(size)));
#else
        return rawCount(info.Env(), ::write(fd, address, static_cast<size_t>(size)));
#endif
    }));
    exports.Set("rawSeek", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        int fd = info[0].As<Napi::Number>().Int32Value();
        int64_t offset = std::strtoll(info[1].As<Napi::String>().Utf8Value().c_str(), nullptr, 10);
        int whence = info[2].As<Napi::Number>().Int32Value();
#ifdef _WIN32
        return rawCount(info.Env(), _lseeki64(fd, offset, whence));
#else
        return rawCount(info.Env(), ::lseek(fd, static_cast<off_t>(offset), whence));
#endif
    }));
    exports.Set("rawErrno", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return Napi::Number::New(info.Env(), rawLastError);
    }));
    exports.Set("rawOpenFlags", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        int values[] = { O_RDONLY, O_WRONLY, O_RDWR, O_CREAT, O_TRUNC, SEEK_SET,
#ifdef _WIN32
        _O_BINARY
#else
        0
#endif
    };
        Napi::Array result = Napi::Array::New(info.Env(), 7);
        for (uint32_t i = 0; i < 7; ++i) result.Set(i, values[i]);
        return result;
    }));
    exports.Set("rawDescriptorCommands", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
#ifdef _WIN32
        return info.Env().Null();
#else
        int values[] = { F_GETFD, F_SETFD, FD_CLOEXEC, EBADF };
        Napi::Array result = Napi::Array::New(info.Env(), 4);
        for (uint32_t i = 0; i < 4; ++i) result.Set(i, values[i]);
        return result;
#endif
    }));
    exports.Set("rawFcntlNoArgument", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
#ifdef _WIN32
        errno = ENOSYS; return rawInteger(info.Env(), -1);
#else
        return rawInteger(info.Env(), ::fcntl(info[0].As<Napi::Number>().Int32Value(), info[1].As<Napi::Number>().Int32Value()));
#endif
    }));
    exports.Set("rawFcntlInteger", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
#ifdef _WIN32
        errno = ENOSYS; return rawInteger(info.Env(), -1);
#else
        return rawInteger(info.Env(), ::fcntl(info[0].As<Napi::Number>().Int32Value(), info[1].As<Napi::Number>().Int32Value(), info[2].As<Napi::Number>().Int32Value()));
#endif
    }));
    exports.Set("rawFcntlPointer", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
#ifdef _WIN32
        errno = ENOSYS; return rawInteger(info.Env(), -1);
#else
        return rawInteger(info.Env(), ::fcntl(info[0].As<Napi::Number>().Int32Value(), info[1].As<Napi::Number>().Int32Value(), rawPointer(info[2])));
#endif
    }));
}
