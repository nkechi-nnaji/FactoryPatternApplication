package com.nkechinnaji.factorypatternapplication.segments

class AppServer: IServer {
    override fun resolve(): String {
        return "Performing some complex App Server Resolution Algorithm"

    }
}