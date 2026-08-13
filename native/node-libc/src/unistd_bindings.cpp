// unistd_bindings.cpp — N-API wrappers for C unistd.h functions
#include <napi.h>
#include <unistd.h>
#include <cerrno>

void RegisterUnistdBindings(Napi::Env env, Napi::Object exports) {
    // close
    exports.Set("close", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "close requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        return Napi::Number::New(env, ::close(fd));
    }));

    // read — returns number of bytes read into buffer
    exports.Set("read", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "read requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        auto buffer = info[1].As<Napi::Uint8Array>();
        size_t count = info[2].As<Napi::Number>().Int64Value();
        ssize_t result = ::read(fd, buffer.Data(), count);
        return Napi::Number::New(env, result);
    }));

    // write — returns number of bytes written
    exports.Set("write", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "write requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        auto buffer = info[1].As<Napi::Uint8Array>();
        size_t count = info[2].As<Napi::Number>().Int64Value();
        ssize_t result = ::write(fd, buffer.Data(), count);
        return Napi::Number::New(env, result);
    }));

    // lseek
    exports.Set("lseek", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "lseek requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        off_t offset = info[1].As<Napi::Number>().Int64Value();
        int whence = info[2].As<Napi::Number>().Int32Value();
        return Napi::Number::New(env, static_cast<double>(::lseek(fd, offset, whence)));
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
        std::string path = info[0].As<Napi::String>().Utf8Value();
        int mode = info[1].As<Napi::Number>().Int32Value();
        return Napi::Number::New(env, ::access(path.c_str(), mode));
    }));

    // unlink
    exports.Set("unlink", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "unlink requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string path = info[0].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, ::unlink(path.c_str()));
    }));

    // gethostname
    exports.Set("gethostname", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        char name[256];
        if (::gethostname(name, sizeof(name)) != 0) {
            return Napi::String::New(env, "");
        }
        return Napi::String::New(env, name);
    }));

    // getpid
    exports.Set("getpid", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        return Napi::Number::New(info.Env(), ::getpid());
    }));

    // getppid
    exports.Set("getppid", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        return Napi::Number::New(info.Env(), ::getppid());
    }));

    // sleep
    exports.Set("sleep", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "sleep requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        unsigned int seconds = info[0].As<Napi::Number>().Uint32Value();
        return Napi::Number::New(env, ::sleep(seconds));
    }));
}