package com.craftinginterpreters.lox;

class RuntimeError extends RuntimeException {
    final Token token;

    RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }

    // TODO:. Instead of implicitly initializing variables to nil, make it a runtime error
}