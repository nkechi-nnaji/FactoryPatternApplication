package com.nkechinnaji.factorypatternapplication.segments

class MailServer : IServer {
    override fun resolve() : String {
        return "Performing some complex Mail Server Resolution Algorithm"
    }
}