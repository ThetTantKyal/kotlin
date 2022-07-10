package com.zawmoehtike.kotlin_workshop.day11

import kotlin.jvm.JvmStatic
import com.zawmoehtike.kotlin_workshop.day11.DownloadVideoThread
import com.zawmoehtike.kotlin_workshop.day11.DownloadFileThread

internal object ThreadExample {

    @JvmStatic
    fun main(args: Array<String>) {

        /*
         Main Thread
         DownloadVideoThread
         DownloadFileThread
         */
        val thread1 = DownloadVideoThread()
        thread1.start() // It is work on DownloadVideoThread

        val thread2 = DownloadFileThread()
        thread2.start() // It is work on DownloadFileThread

        /*for (int i = 0; i <= 100; i = i + 10) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

                System.out.println("Error is " + e.getMessage());
            }

            System.out.println("Downloading Video " + i + "%");
        }

        for (int i = 0; i <= 100; i = i + 10) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

                System.out.println("Error is " + e.getMessage());
            }

            System.out.println("Downloading File " + i + "%");
        }*/

        // It is work on Main Thread
        println("Showing UI on Main Thread")
    }
}

internal class DownloadVideoThread : Thread() {

    override fun run() {
        super.run()

        var i = 0

        while (i <= 100) {
            try {
                sleep(1000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
                println("Error is " + e.message)
            }

            println("Downloading Video $i%")

            i = i + 10
        }
    }
}

internal class DownloadFileThread : Thread() {

    override fun run() {
        super.run()

        var i = 0

        while (i <= 100) {
            try {
                sleep(1000) // 1000ms = 1s
            } catch (e: InterruptedException) {
                e.printStackTrace()
                println("Error is " + e.message)
            }

            println("Downloading File $i%")

            i = i + 10
        }
    }
}