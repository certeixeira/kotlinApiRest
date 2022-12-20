package com.certeixeira.demo.exception

import java.lang.RuntimeException

class NotFoundException(message: String): RuntimeException(message) {
}