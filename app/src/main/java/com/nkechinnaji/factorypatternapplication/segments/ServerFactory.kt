package com.nkechinnaji.factorypatternapplication.segments

class ServerFactory {
    fun getServer(serverType: String) : IServer{
        return when(serverType){
            "mail" -> MailServer()
            "ftp" -> FTPServer()
            "app" -> AppServer()
            "other" -> InvalidServer()
            else -> throw Exception("Invalid server type")
        }
    }
}