package com.nkechinnaji.factorypatternapplication.segments

class InvalidServer : IServer {
    override fun resolve(): String {
        return "Invalid server type. Please call customer service"

    }
}